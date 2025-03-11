package com.example.waterbill.controller;

import com.example.waterbill.model.VaiTro;
import com.example.waterbill.service.VaiTroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vaitro")
public class VaiTroController {

    @Autowired
    private VaiTroService vaiTroService;

    @GetMapping
    public List<VaiTro> getAllVaiTro() {
        return vaiTroService.getAllVaiTro();
    }

    @GetMapping("/{id}")
    public Optional<VaiTro> getVaiTroById(@PathVariable int id) {
        return vaiTroService.getVaiTroById(id);
    }

    @PostMapping
    public VaiTro saveVaiTro(@RequestBody VaiTro vaiTro) {
        return vaiTroService.saveVaiTro(vaiTro);
    }

    @DeleteMapping("/{id}")
    public void deleteVaiTro(@PathVariable int id) {
        vaiTroService.deleteVaiTro(id);
    }
}
