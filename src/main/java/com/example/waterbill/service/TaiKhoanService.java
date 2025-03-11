package com.example.waterbill.service;

import com.example.waterbill.model.TaiKhoan;
import com.example.waterbill.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaiKhoanService {

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    public List<TaiKhoan> getAllTaiKhoan() {
        return taiKhoanRepository.findAll();
    }

    public Optional<TaiKhoan> getTaiKhoanById(int id) {
        return taiKhoanRepository.findById(id);
    }

    public TaiKhoan saveTaiKhoan(TaiKhoan taiKhoan) {
        return taiKhoanRepository.save(taiKhoan);
    }

    public void deleteTaiKhoan(int id) {
        taiKhoanRepository.deleteById(id);
    }
}
