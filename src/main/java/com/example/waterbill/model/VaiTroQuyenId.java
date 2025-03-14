package com.example.waterbill.model;

import java.io.Serializable;
import java.util.Objects;

public class VaiTroQuyenId implements Serializable {
    private int maVaiTro;
    private int maQuyen;

    // Constructors
    public VaiTroQuyenId() {}

    public VaiTroQuyenId(int maVaiTro, int maQuyen) {
        this.maVaiTro = maVaiTro;
        this.maQuyen = maQuyen;
    }

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

    // Override equals & hashCode (bắt buộc với khóa chính hỗn hợp)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VaiTroQuyenId that = (VaiTroQuyenId) o;
        return maVaiTro == that.maVaiTro && maQuyen == that.maQuyen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maVaiTro, maQuyen);
    }
}
