package com.example.waterbill.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.waterbill.model.HoaDon;
import com.example.waterbill.repository.HoaDonRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class HoaDonService {

    @Autowired
    private HoaDonRepository hoaDonRepository;

    // Lấy tất cả hóa đơn
    public List<HoaDon> getAllHoaDon() {
        return hoaDonRepository.findAll();
    }

    // Lấy hóa đơn theo ID
    public Optional<HoaDon> getHoaDonById(int id) {
        return hoaDonRepository.findById(id);
    }

    // Lưu hóa đơn
    public HoaDon saveHoaDon(HoaDon hoaDon) {
        hoaDon.setTongTien(tinhTienNuoc(hoaDon));

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

    // Xóa hóa đơn
    public void deleteHoaDon(int id) {
        hoaDonRepository.deleteById(id);
    }

    // Lấy hóa đơn tháng này theo mã người dùng (mã hộ)
    public Optional<HoaDon> getHoaDonByMaHo(int maNguoiDung, LocalDate thangNam) {
        return hoaDonRepository.findByNguoiThanhToan_MaNguoiDungAndNgXuatHoaDon(maNguoiDung, thangNam);
    }

    // Lấy danh sách hóa đơn theo mã người dùng
    public List<HoaDon> getHoaDonByUserId(int maNguoiDung) {
        return hoaDonRepository.findByNguoiThanhToan_MaNguoiDung(maNguoiDung);
    }

    // Hàm tính tổng tiền hóa đơn
    private double tinhTienNuoc(HoaDon hoaDon) {
        double giaNuocMoiMetKhoi = 10000;
        int soNuocTieuThu = 30; // Cần lấy từ bảng chỉ số nước
        return soNuocTieuThu * giaNuocMoiMetKhoi + hoaDon.getPhiPhat();
    }
}
