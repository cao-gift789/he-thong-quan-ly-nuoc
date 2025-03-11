package com.example.waterbill.service;

import com.example.waterbill.model.CuocTroChuyen;
import com.example.waterbill.repository.CuocTroChuyenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuocTroChuyenService {

    @Autowired
    private CuocTroChuyenRepository cuocTroChuyenRepository;

    public List<CuocTroChuyen> getAllCuocTroChuyen() {
        return cuocTroChuyenRepository.findAll();
    }

    public Optional<CuocTroChuyen> getCuocTroChuyenById(int id) {
        return cuocTroChuyenRepository.findById(id);
    }

    public CuocTroChuyen saveCuocTroChuyen(CuocTroChuyen cuocTroChuyen) {
        return cuocTroChuyenRepository.save(cuocTroChuyen);
    }

    public void deleteCuocTroChuyen(int id) {
        cuocTroChuyenRepository.deleteById(id);
    }
}
