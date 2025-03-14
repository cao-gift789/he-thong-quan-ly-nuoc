package com.example.waterbill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.waterbill.model.HoaDon;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {

    // Lấy hóa đơn theo mã người dùng (mã hộ) và tháng/năm
    Optional<HoaDon> findByNguoiThanhToan_MaNguoiDungAndNgXuatHoaDon(int maNguoiDung, LocalDate ngXuatHoaDon);

    // Lấy danh sách hóa đơn theo mã người dùng
    List<HoaDon> findByNguoiThanhToan_MaNguoiDung(int maNguoiDung);
}
