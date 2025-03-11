package com.example.waterbill.service;

import com.example.waterbill.model.GiaoDich;
import com.example.waterbill.repository.GiaoDichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiaoDichService {

    @Autowired
    private GiaoDichRepository giaoDichRepository;

    public List<GiaoDich> getAllGiaoDich() {
        return giaoDichRepository.findAll();
    }

    public Optional<GiaoDich> getGiaoDichById(int id) {
        return giaoDichRepository.findById(id);
    }

    public GiaoDich saveGiaoDich(GiaoDich giaoDich) {
        return giaoDichRepository.save(giaoDich);
    }

    public void deleteGiaoDich(int id) {
        giaoDichRepository.deleteById(id);
    }
}
