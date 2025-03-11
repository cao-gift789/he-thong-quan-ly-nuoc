package com.example.waterbill.service;

import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.repository.NguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
}
