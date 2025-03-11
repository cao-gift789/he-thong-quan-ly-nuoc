package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class CuocTroChuyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maCuocTroChuyen;

    @ManyToOne
    @JoinColumn(name = "maNguoiDung")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "maNV")
    private NguoiDung nhanVien;

    private java.time.LocalDateTime thoiGianBatDau;

	public int getMaCuocTroChuyen() {
		return maCuocTroChuyen;
	}

	public void setMaCuocTroChuyen(int maCuocTroChuyen) {
		this.maCuocTroChuyen = maCuocTroChuyen;
	}

	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}

	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}

	public NguoiDung getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NguoiDung nhanVien) {
		this.nhanVien = nhanVien;
	}

	public java.time.LocalDateTime getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(java.time.LocalDateTime thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

}
