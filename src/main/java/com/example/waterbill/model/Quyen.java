package com.example.waterbill.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Quyen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maQuyen;

    private String tenQuyen;
    private String moTa;
    
	public int getMaQuyen() {
		return maQuyen;
	}
	public void setMaQuyen(int maQuyen) {
		this.maQuyen = maQuyen;
	}
	public String getTenQuyen() {
		return tenQuyen;
	}
	public void setTenQuyen(String tenQuyen) {
		this.tenQuyen = tenQuyen;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}    
}
