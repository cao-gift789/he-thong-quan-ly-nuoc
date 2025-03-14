package com.example.waterbill.service;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.repository.NguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class NguoiDungService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    public List<NguoiDung> getAllNguoiDung() {
        return nguoiDungRepository.findAll();
    }

    public Optional<NguoiDung> getNguoiDungById(int id) {
        return nguoiDungRepository.findById(id);
    }

    public NguoiDung saveNguoiDung(NguoiDung nguoiDung) {
        return nguoiDungRepository.save(nguoiDung);
    }

    public void deleteNguoiDung(int id) {
        nguoiDungRepository.deleteById(id);
    }

    // Tìm người dùng theo tên và mật khẩu
    public Optional<NguoiDung> getNguoiDungByTenNguoiDungAndMatKhau(String tenNguoiDung, String matKhau) {
        return nguoiDungRepository.findByTenNguoiDungAndTaiKhoan_MatKhau(tenNguoiDung, matKhau);
    }
}
