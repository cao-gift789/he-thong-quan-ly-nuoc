package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class QuanLyCoSo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maQL;

    @ManyToOne
    @JoinColumn(name = "maNguoiDung")
    private NguoiDung nguoiDung;

    @ManyToOne
    @JoinColumn(name = "maCSDK")
    private CoSoDangKy coSoDangKy;

    private java.time.LocalDate ngayCapQuyen;
    private boolean trangThaiQL;
	public int getMaQL() {
		return maQL;
	}
	public void setMaQL(int maQL) {
		this.maQL = maQL;
	}
	public NguoiDung getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(NguoiDung nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	public CoSoDangKy getCoSoDangKy() {
		return coSoDangKy;
	}
	public void setCoSoDangKy(CoSoDangKy coSoDangKy) {
		this.coSoDangKy = coSoDangKy;
	}
	public java.time.LocalDate getNgayCapQuyen() {
		return ngayCapQuyen;
	}
	public void setNgayCapQuyen(java.time.LocalDate ngayCapQuyen) {
		this.ngayCapQuyen = ngayCapQuyen;
	}
	public boolean isTrangThaiQL() {
		return trangThaiQL;
	}
	public void setTrangThaiQL(boolean trangThaiQL) {
		this.trangThaiQL = trangThaiQL;
	}

}
