package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class PhuongThucThanhToan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPTTT;

    private String tenPTTT;
    private String moTa;
	public int getMaPTTT() {
		return maPTTT;
	}
	public void setMaPTTT(int maPTTT) {
		this.maPTTT = maPTTT;
	}
	public String getTenPTTT() {
		return tenPTTT;
	}
	public void setTenPTTT(String tenPTTT) {
		this.tenPTTT = tenPTTT;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

}
