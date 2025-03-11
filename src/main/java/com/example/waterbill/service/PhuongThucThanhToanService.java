package com.example.waterbill.service;

import com.example.waterbill.model.PhuongThucThanhToan;
import com.example.waterbill.repository.PhuongThucThanhToanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhuongThucThanhToanService {

    @Autowired
    private PhuongThucThanhToanRepository phuongThucThanhToanRepository;

    public List<PhuongThucThanhToan> getAllPhuongThucThanhToan() {
        return phuongThucThanhToanRepository.findAll();
    }

    public Optional<PhuongThucThanhToan> getPhuongThucThanhToanById(int id) {
        return phuongThucThanhToanRepository.findById(id);
    }

    public PhuongThucThanhToan savePhuongThucThanhToan(PhuongThucThanhToan phuongThucThanhToan) {
        return phuongThucThanhToanRepository.save(phuongThucThanhToan);
    }

    public void deletePhuongThucThanhToan(int id) {
        phuongThucThanhToanRepository.deleteById(id);
    }
}
