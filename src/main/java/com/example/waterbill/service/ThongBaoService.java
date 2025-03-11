package com.example.waterbill.service;

import com.example.waterbill.model.ThongBao;
import com.example.waterbill.repository.ThongBaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ThongBaoService {

    @Autowired
    private ThongBaoRepository thongBaoRepository;

    public List<ThongBao> getAllThongBao() {
        return thongBaoRepository.findAll();
    }

    public Optional<ThongBao> getThongBaoById(int id) {
        return thongBaoRepository.findById(id);
    }

    public ThongBao saveThongBao(ThongBao thongBao) {
        return thongBaoRepository.save(thongBao);
    }

    public void deleteThongBao(int id) {
        thongBaoRepository.deleteById(id);
    }
}
