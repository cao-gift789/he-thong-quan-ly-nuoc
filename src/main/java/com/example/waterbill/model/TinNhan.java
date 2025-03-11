package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class TinNhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTinNhan;

    @ManyToOne
    @JoinColumn(name = "maCuocTroChuyen")
    private CuocTroChuyen cuocTroChuyen;

    private String nguoiGui;
    private String noiDung;
    private String trangThai;
    private java.time.LocalDateTime thoiGianGui;
	public int getMaTinNhan() {
		return maTinNhan;
	}
	public void setMaTinNhan(int maTinNhan) {
		this.maTinNhan = maTinNhan;
	}
	public CuocTroChuyen getCuocTroChuyen() {
		return cuocTroChuyen;
	}
	public void setCuocTroChuyen(CuocTroChuyen cuocTroChuyen) {
		this.cuocTroChuyen = cuocTroChuyen;
	}
	public String getNguoiGui() {
		return nguoiGui;
	}
	public void setNguoiGui(String nguoiGui) {
		this.nguoiGui = nguoiGui;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
	public java.time.LocalDateTime getThoiGianGui() {
		return thoiGianGui;
	}
	public void setThoiGianGui(java.time.LocalDateTime thoiGianGui) {
		this.thoiGianGui = thoiGianGui;
	}

}
