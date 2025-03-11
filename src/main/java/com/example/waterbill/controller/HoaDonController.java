package com.example.waterbill.controller;

import com.example.waterbill.model.HoaDon;
import com.example.waterbill.service.HoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hoadon")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    @GetMapping
    public List<HoaDon> getAllHoaDon() {
        return hoaDonService.getAllHoaDon();
    }

    @GetMapping("/{id}")
    public Optional<HoaDon> getHoaDonById(@PathVariable int id) {
        return hoaDonService.getHoaDonById(id);
    }

    @PostMapping
    public HoaDon saveHoaDon(@RequestBody HoaDon hoaDon) {
        return hoaDonService.saveHoaDon(hoaDon);
    }

    @DeleteMapping("/{id}")
    public void deleteHoaDon(@PathVariable int id) {
        hoaDonService.deleteHoaDon(id);
    }
    // 🔥 **Thêm API lấy hóa đơn theo mã người dùng**
    @GetMapping("/nguoidung/{maNguoiDung}")
    public List<HoaDon> getHoaDonByUserId(@PathVariable int maNguoiDung) {
        return hoaDonService.getHoaDonByUserId(maNguoiDung);
    }

    // 🔥 **API cập nhật hóa đơn**
    @PutMapping("/{id}")
    public HoaDon updateHoaDon(@PathVariable int id, @RequestBody HoaDon hoaDonDetails) {
        return hoaDonService.updateHoaDon(id, hoaDonDetails);
    }

    // 🔥 **API cập nhật trạng thái thanh toán**
    @PatchMapping("/{id}/trangthai")
    public HoaDon updateTrangThai(@PathVariable int id, @RequestParam String trangThai) {
        return hoaDonService.updateTrangThai(id, trangThai);
    }
}
