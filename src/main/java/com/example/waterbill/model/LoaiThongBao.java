package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class LoaiThongBao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maLoaiTB;

    private String tenLoaiTB;
    private String moTa;
	public int getMaLoaiTB() {
		return maLoaiTB;
	}
	public void setMaLoaiTB(int maLoaiTB) {
		this.maLoaiTB = maLoaiTB;
	}
	public String getTenLoaiTB() {
		return tenLoaiTB;
	}
	public void setTenLoaiTB(String tenLoaiTB) {
		this.tenLoaiTB = tenLoaiTB;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
