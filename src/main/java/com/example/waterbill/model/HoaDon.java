package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maHoaDon;
	
	private java.time.LocalDate ngXuatHoaDon;
	private java.time.LocalDate ngDaoHan;
	private java.time.LocalDate ngThanhToan;
	
	@ManyToOne
	@JoinColumn(name = "maNVNhap")
	private NguoiDung nguoiNhap;
	
	@ManyToOne
    @JoinColumn(name = "nguoiThanhToan")
    private NguoiDung nguoiThanhToan;

    @ManyToOne
    @JoinColumn(name = "maCSDK")
    private CoSoDangKy coSoDangKy;

    @ManyToOne
    @JoinColumn(name = "nvThuTien")
    private NguoiDung nvThuTien;

    private java.time.LocalDateTime ngayTaoHoaDon;
    private double phiPhat;
	public int getMaHoaDon() {
		return maHoaDon;
	}
	public void setMaHoaDon(int maHoaDon) {
		this.maHoaDon = maHoaDon;
	}
	public java.time.LocalDate getNgXuatHoaDon() {
		return ngXuatHoaDon;
	}
	public void setNgXuatHoaDon(java.time.LocalDate ngXuatHoaDon) {
		this.ngXuatHoaDon = ngXuatHoaDon;
	}
	public java.time.LocalDate getNgDaoHan() {
		return ngDaoHan;
	}
	public void setNgDaoHan(java.time.LocalDate ngDaoHan) {
		this.ngDaoHan = ngDaoHan;
	}
	public java.time.LocalDate getNgThanhToan() {
		return ngThanhToan;
	}
	public void setNgThanhToan(java.time.LocalDate ngThanhToan) {
		this.ngThanhToan = ngThanhToan;
	}
	public NguoiDung getNguoiNhap() {
		return nguoiNhap;
	}
	public void setNguoiNhap(NguoiDung nguoiNhap) {
		this.nguoiNhap = nguoiNhap;
	}
	public NguoiDung getNguoiThanhToan() {
		return nguoiThanhToan;
	}
	public void setNguoiThanhToan(NguoiDung nguoiThanhToan) {
		this.nguoiThanhToan = nguoiThanhToan;
	}
	public CoSoDangKy getCoSoDangKy() {
		return coSoDangKy;
	}
	public void setCoSoDangKy(CoSoDangKy coSoDangKy) {
		this.coSoDangKy = coSoDangKy;
	}
	public NguoiDung getNvThuTien() {
		return nvThuTien;
	}
	public void setNvThuTien(NguoiDung nvThuTien) {
		this.nvThuTien = nvThuTien;
	}
	public java.time.LocalDateTime getNgayTaoHoaDon() {
		return ngayTaoHoaDon;
	}
	public void setNgayTaoHoaDon(java.time.LocalDateTime ngayTaoHoaDon) {
		this.ngayTaoHoaDon = ngayTaoHoaDon;
	}
	public double getPhiPhat() {
		return phiPhat;
	}
	public void setPhiPhat(double phiPhat) {
		this.phiPhat = phiPhat;
	}
	
	private double tongTien;

    // **Thêm trường `trangThai`**
    @Enumerated(EnumType.STRING)
    private TrangThaiHoaDon trangThai;

    // ENUM để định nghĩa trạng thái thanh toán
    public enum TrangThaiHoaDon {
        CHUA_THANH_TOAN, DA_THANH_TOAN, TRE_HAN
    }

    // GETTER & SETTER
    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public TrangThaiHoaDon getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(TrangThaiHoaDon trangThai) {
        this.trangThai = trangThai;
    }
}
