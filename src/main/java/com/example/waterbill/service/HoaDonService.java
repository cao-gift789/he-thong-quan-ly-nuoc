package com.example.waterbill.service;

import com.example.waterbill.model.HoaDon;
import com.example.waterbill.repository.HoaDonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    public List<HoaDon> getAllHoaDon() {
        return hoaDonRepository.findAll();
    }

    public Optional<HoaDon> getHoaDonById(int id) {
        return hoaDonRepository.findById(id);
    }

    public HoaDon saveHoaDon(HoaDon hoaDon) {
        // ✅ **Tính tổng tiền hóa đơn**
        hoaDon.setTongTien(tinhTienNuoc(hoaDon));

        // ✅ **Xác định trạng thái thanh toán**
        if (hoaDon.getNgThanhToan() == null) {
            if (hoaDon.getNgDaoHan().isBefore(LocalDate.now())) {
                hoaDon.setTrangThai(HoaDon.TrangThaiHoaDon.TRE_HAN);
            } else {
                hoaDon.setTrangThai(HoaDon.TrangThaiHoaDon.CHUA_THANH_TOAN);
            }
        } else {
            hoaDon.setTrangThai(HoaDon.TrangThaiHoaDon.DA_THANH_TOAN);
        }

        return hoaDonRepository.save(hoaDon);
    }

    public void deleteHoaDon(int id) {
        hoaDonRepository.deleteById(id);
    }

    // 🔥 **Lấy danh sách hóa đơn theo mã người dùng**
    public List<HoaDon> getHoaDonByUserId(int maNguoiDung) {
        return hoaDonRepository.findByNguoiThanhToan_MaNguoiDung(maNguoiDung);
    }

    // 🔥 **Cập nhật hóa đơn**
    public HoaDon updateHoaDon(int id, HoaDon hoaDonDetails) {
        Optional<HoaDon> hoaDonOptional = hoaDonRepository.findById(id);
        if (hoaDonOptional.isPresent()) {
            HoaDon hoaDon = hoaDonOptional.get();
            hoaDon.setNgXuatHoaDon(hoaDonDetails.getNgXuatHoaDon());
            hoaDon.setNgDaoHan(hoaDonDetails.getNgDaoHan());
            hoaDon.setNgThanhToan(hoaDonDetails.getNgThanhToan());
            hoaDon.setTongTien(hoaDonDetails.getTongTien());
            hoaDon.setTrangThai(hoaDonDetails.getTrangThai());
            return hoaDonRepository.save(hoaDon);
        } else {
            throw new RuntimeException("Không tìm thấy hóa đơn có ID: " + id);
        }
    }

    // 🔥 **Cập nhật trạng thái thanh toán**
    public HoaDon updateTrangThai(int id, String trangThai) {
        Optional<HoaDon> hoaDonOptional = hoaDonRepository.findById(id);
        if (hoaDonOptional.isPresent()) {
            HoaDon hoaDon = hoaDonOptional.get();
            hoaDon.setTrangThai(HoaDon.TrangThaiHoaDon.valueOf(trangThai));
            return hoaDonRepository.save(hoaDon);
        } else {
            throw new RuntimeException("Không tìm thấy hóa đơn có ID: " + id);
        }
    }

    // ✅ **Hàm tính tổng tiền hóa đơn**
    private double tinhTienNuoc(HoaDon hoaDon) {
        double giaNuocMoiMetKhoi = 10000;
        int soNuocTieuThu = 30; // Cần lấy từ bảng chỉ số nước
        return soNuocTieuThu * giaNuocMoiMetKhoi + hoaDon.getPhiPhat();
    }
}
