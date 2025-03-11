package com.example.waterbill.service;

import com.example.waterbill.model.Quyen;
import com.example.waterbill.repository.QuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuyenService {

    @Autowired
    private QuyenRepository quyenRepository;

    public List<Quyen> getAllQuyen() {
        return quyenRepository.findAll();
    }

    public Optional<Quyen> getQuyenById(int id) {
        return quyenRepository.findById(id);
    }

    public Quyen saveQuyen(Quyen quyen) {
        return quyenRepository.save(quyen);
    }

    public void deleteQuyen(int id) {
        quyenRepository.deleteById(id);
    }
}
