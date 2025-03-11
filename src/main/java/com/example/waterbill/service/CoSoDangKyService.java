package com.example.waterbill.service;

import com.example.waterbill.model.CoSoDangKy;
import com.example.waterbill.repository.CoSoDangKyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoSoDangKyService {

    @Autowired
    private CoSoDangKyRepository coSoDangKyRepository;

    public List<CoSoDangKy> getAllCoSoDangKy() {
        return coSoDangKyRepository.findAll();
    }

    public Optional<CoSoDangKy> getCoSoDangKyById(int id) {
        return coSoDangKyRepository.findById(id);
    }

    public CoSoDangKy saveCoSoDangKy(CoSoDangKy coSoDangKy) {
        return coSoDangKyRepository.save(coSoDangKy);
    }

    public void deleteCoSoDangKy(int id) {
        coSoDangKyRepository.deleteById(id);
    }
}
