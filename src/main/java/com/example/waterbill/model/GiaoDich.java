package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class GiaoDich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maGiaoDich;

    @ManyToOne
    @JoinColumn(name = "maHoaDon")
    private HoaDon hoaDon;

    @ManyToOne
    @JoinColumn(name = "maPTTT")
    private PhuongThucThanhToan phuongThucThanhToan;

    private double soTien;
    private String trangThai;
    private java.time.LocalDateTime ngayGiaoDich;
    private String maThamChieu;
	public int getMaGiaoDich() {
		return maGiaoDich;
	}
	public void setMaGiaoDich(int maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}
	public HoaDon getHoaDon() {
		return hoaDon;
	}
	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}
	public PhuongThucThanhToan getPhuongThucThanhToan() {
		return phuongThucThanhToan;
	}
	public void setPhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
		this.phuongThucThanhToan = phuongThucThanhToan;
	}
	public double getSoTien() {
		return soTien;
	}
	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public java.time.LocalDateTime getNgayGiaoDich() {
		return ngayGiaoDich;
	}
	public void setNgayGiaoDich(java.time.LocalDateTime ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}
	public String getMaThamChieu() {
		return maThamChieu;
	}
	public void setMaThamChieu(String maThamChieu) {
		this.maThamChieu = maThamChieu;
	}

}
