package com.example.waterbill.service;

import com.example.waterbill.model.ChucVu;
import com.example.waterbill.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChucVuService {

    @Autowired
    private ChucVuRepository chucVuRepository;

    public List<ChucVu> getAllChucVu() {
        return chucVuRepository.findAll();
    }

    public Optional<ChucVu> getChucVuById(int id) {
        return chucVuRepository.findById(id);
    }

    public ChucVu saveChucVu(ChucVu chucVu) {
        return chucVuRepository.save(chucVu);
    }

    public void deleteChucVu(int id) {
        chucVuRepository.deleteById(id);
    }
}
