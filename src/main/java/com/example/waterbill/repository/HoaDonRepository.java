package com.example.waterbill.repository;

import com.example.waterbill.model.HoaDon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
	List<HoaDon> findByNguoiThanhToan_MaNguoiDung(int maNguoiDung);

}
