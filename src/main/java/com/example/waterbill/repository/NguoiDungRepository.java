package com.example.waterbill.repository;

import com.example.waterbill.model.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {

    // Tìm kiếm người dùng theo tên người dùng và mật khẩu
    Optional<NguoiDung> findByTenNguoiDungAndTaiKhoan_MatKhau(String tenNguoiDung, String taiKhoan_matKhau);
}
