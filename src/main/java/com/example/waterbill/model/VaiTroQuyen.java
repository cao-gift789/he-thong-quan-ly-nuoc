package com.example.waterbill.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@IdClass(VaiTroQuyenId.class)  // Định nghĩa khóa chính hỗn hợp
public class VaiTroQuyen {

    @Id
    private int maVaiTro;

    @Id
    private int maQuyen;

    @ManyToOne
    @JoinColumn(name = "maVaiTro", insertable = false, updatable = false)
    private VaiTro vaiTro;

    @ManyToOne
    @JoinColumn(name = "maQuyen", insertable = false, updatable = false)
    private Quyen quyen;

    // Getters & Setters
    public int getMaVaiTro() {
        return maVaiTro;
    }

    public void setMaVaiTro(int maVaiTro) {
        this.maVaiTro = maVaiTro;
    }

    public int getMaQuyen() {
        return maQuyen;
    }

    public void setMaQuyen(int maQuyen) {
        this.maQuyen = maQuyen;
    }

    public VaiTro getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(VaiTro vaiTro) {
        this.vaiTro = vaiTro;
    }

    public Quyen getQuyen() {
        return quyen;
    }

    public void setQuyen(Quyen quyen) {
        this.quyen = quyen;
    }
}
