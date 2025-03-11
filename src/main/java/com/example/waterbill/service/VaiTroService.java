package com.example.waterbill.service;

import com.example.waterbill.model.VaiTro;
import com.example.waterbill.repository.VaiTroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaiTroService {

    @Autowired
    private VaiTroRepository vaiTroRepository;

    public List<VaiTro> getAllVaiTro() {
        return vaiTroRepository.findAll();
    }

    public Optional<VaiTro> getVaiTroById(int id) {
        return vaiTroRepository.findById(id);
    }

    public VaiTro saveVaiTro(VaiTro vaiTro) {
        return vaiTroRepository.save(vaiTro);
    }

    public void deleteVaiTro(int id) {
        vaiTroRepository.deleteById(id);
    }
}
