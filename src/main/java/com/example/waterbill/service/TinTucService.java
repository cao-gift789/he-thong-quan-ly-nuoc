package com.example.waterbill.service;

import com.example.waterbill.model.TinTuc;
import com.example.waterbill.repository.TinTucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TinTucService {

    @Autowired
    private TinTucRepository tinTucRepository;

    public List<TinTuc> getAllTinTuc() {
        return tinTucRepository.findAll();
    }

    public Optional<TinTuc> getTinTucById(int id) {
        return tinTucRepository.findById(id);
    }

    public TinTuc saveTinTuc(TinTuc tinTuc) {
        return tinTucRepository.save(tinTuc);
    }

    public void deleteTinTuc(int id) {
        tinTucRepository.deleteById(id);
    }
}
