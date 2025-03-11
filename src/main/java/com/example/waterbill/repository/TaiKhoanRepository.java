package com.example.waterbill.repository;

import com.example.waterbill.model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Đảm bảo có annotation này!
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
}
