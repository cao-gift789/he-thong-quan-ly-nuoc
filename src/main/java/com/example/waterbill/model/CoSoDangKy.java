package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class CoSoDangKy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maCSDK;

    private String diaChi;
    private java.time.LocalDate ngayDangKy;
    private boolean trangThaiHoatDong;

    @ManyToOne
    @JoinColumn(name = "nguoiDangKy")
    private NguoiDung nguoiDangKy;

	public int getMaCSDK() {
		return maCSDK;
	}

	public void setMaCSDK(int maCSDK) {
		this.maCSDK = maCSDK;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public java.time.LocalDate getNgayDangKy() {
		return ngayDangKy;
	}

	public void setNgayDangKy(java.time.LocalDate ngayDangKy) {
		this.ngayDangKy = ngayDangKy;
	}

	public boolean isTrangThaiHoatDong() {
		return trangThaiHoatDong;
	}

	public void setTrangThaiHoatDong(boolean trangThaiHoatDong) {
		this.trangThaiHoatDong = trangThaiHoatDong;
	}

	public NguoiDung getNguoiDangKy() {
		return nguoiDangKy;
	}

	public void setNguoiDangKy(NguoiDung nguoiDangKy) {
		this.nguoiDangKy = nguoiDangKy;
	}

}
