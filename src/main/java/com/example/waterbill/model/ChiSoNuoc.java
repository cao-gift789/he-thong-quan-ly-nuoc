package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class ChiSoNuoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maChiSoNuoc;

    private java.time.LocalDate thoiGian;
    private int chiSoCu;
    private int chiSoMoi;
    private int soNuocSuDung;

    @ManyToOne
    @JoinColumn(name = "maNoiDangKy")
    private CoSoDangKy coSoDangKy;

    private java.time.LocalDateTime thoiGianNhap;

	public int getMaChiSoNuoc() {
		return maChiSoNuoc;
	}

	public void setMaChiSoNuoc(int maChiSoNuoc) {
		this.maChiSoNuoc = maChiSoNuoc;
	}

	public java.time.LocalDate getThoiGian() {
		return thoiGian;
	}

	public void setThoiGian(java.time.LocalDate thoiGian) {
		this.thoiGian = thoiGian;
	}

	public int getChiSoCu() {
		return chiSoCu;
	}

	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}

	public int getChiSoMoi() {
		return chiSoMoi;
	}

	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}

	public int getSoNuocSuDung() {
		return soNuocSuDung;
	}

	public void setSoNuocSuDung(int soNuocSuDung) {
		this.soNuocSuDung = soNuocSuDung;
	}

	public CoSoDangKy getCoSoDangKy() {
		return coSoDangKy;
	}

	public void setCoSoDangKy(CoSoDangKy coSoDangKy) {
		this.coSoDangKy = coSoDangKy;
	}

	public java.time.LocalDateTime getThoiGianNhap() {
		return thoiGianNhap;
	}

	public void setThoiGianNhap(java.time.LocalDateTime thoiGianNhap) {
		this.thoiGianNhap = thoiGianNhap;
	}

}
