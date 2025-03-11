package com.example.waterbill.service;

import com.example.waterbill.model.TinNhan;
import com.example.waterbill.repository.TinNhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TinNhanService {

    @Autowired
    private TinNhanRepository tinNhanRepository;

    public List<TinNhan> getAllTinNhan() {
        return tinNhanRepository.findAll();
    }

    public Optional<TinNhan> getTinNhanById(int id) {
        return tinNhanRepository.findById(id);
    }

    public TinNhan saveTinNhan(TinNhan tinNhan) {
        return tinNhanRepository.save(tinNhan);
    }

    public void deleteTinNhan(int id) {
        tinNhanRepository.deleteById(id);
    }
}
