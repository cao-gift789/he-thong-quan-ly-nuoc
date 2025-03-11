package com.example.waterbill.service;

import com.example.waterbill.model.LoaiThongBao;
import com.example.waterbill.repository.LoaiThongBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiThongBaoService {

    @Autowired
    private LoaiThongBaoRepository loaiThongBaoRepository;

    public List<LoaiThongBao> getAllLoaiThongBao() {
        return loaiThongBaoRepository.findAll();
    }

    public Optional<LoaiThongBao> getLoaiThongBaoById(int id) {
        return loaiThongBaoRepository.findById(id);
    }

    public LoaiThongBao saveLoaiThongBao(LoaiThongBao loaiThongBao) {
        return loaiThongBaoRepository.save(loaiThongBao);
    }

    public void deleteLoaiThongBao(int id) {
        loaiThongBaoRepository.deleteById(id);
    }
}
