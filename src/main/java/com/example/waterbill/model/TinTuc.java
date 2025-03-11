package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class TinTuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maTinTuc;

    private String tieuDe;
    private String noiDung;
    private java.time.LocalDateTime ngayTao;

    @ManyToOne
    @JoinColumn(name = "maNguoiTao")
    private NguoiDung nguoiTao;

    private boolean trangThai;

	public int getMaTinTuc() {
		return maTinTuc;
	}

	public void setMaTinTuc(int maTinTuc) {
		this.maTinTuc = maTinTuc;
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

	public java.time.LocalDateTime getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(java.time.LocalDateTime ngayTao) {
		this.ngayTao = ngayTao;
	}

	public NguoiDung getNguoiTao() {
		return nguoiTao;
	}

	public void setNguoiTao(NguoiDung nguoiTao) {
		this.nguoiTao = nguoiTao;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

}
