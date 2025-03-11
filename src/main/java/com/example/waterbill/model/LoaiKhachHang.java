package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class LoaiKhachHang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoai;

    private String tenLoaiKH;
    private String phuongThucTinh;
    private int giaCoDinh;
    private String cachTinhDaoDong;
	public int getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(int maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoaiKH() {
		return tenLoaiKH;
	}
	public void setTenLoaiKH(String tenLoaiKH) {
		this.tenLoaiKH = tenLoaiKH;
	}
	public String getPhuongThucTinh() {
		return phuongThucTinh;
	}
	public void setPhuongThucTinh(String phuongThucTinh) {
		this.phuongThucTinh = phuongThucTinh;
	}
	public int getGiaCoDinh() {
		return giaCoDinh;
	}
	public void setGiaCoDinh(int giaCoDinh) {
		this.giaCoDinh = giaCoDinh;
	}
	public String getCachTinhDaoDong() {
		return cachTinhDaoDong;
	}
	public void setCachTinhDaoDong(String cachTinhDaoDong) {
		this.cachTinhDaoDong = cachTinhDaoDong;
	}

}
