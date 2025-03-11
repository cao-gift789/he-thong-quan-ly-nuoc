package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class ThongBao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maThongBao;

    private java.time.LocalDateTime thoiGianTaoThongBao;

    @ManyToOne
    @JoinColumn(name = "maNguoiGui")
    private NguoiDung nguoiGui;

    private String tieuDe;
    private String noiDung;
	public int getMaThongBao() {
		return maThongBao;
	}
	public void setMaThongBao(int maThongBao) {
		this.maThongBao = maThongBao;
	}
	public java.time.LocalDateTime getThoiGianTaoThongBao() {
		return thoiGianTaoThongBao;
	}
	public void setThoiGianTaoThongBao(java.time.LocalDateTime thoiGianTaoThongBao) {
		this.thoiGianTaoThongBao = thoiGianTaoThongBao;
	}
	public NguoiDung getNguoiGui() {
		return nguoiGui;
	}
	public void setNguoiGui(NguoiDung nguoiGui) {
		this.nguoiGui = nguoiGui;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getNoiDung() {
		return noiDung;
	}
	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

}
