package com.example.waterbill.controller;

import com.example.waterbill.model.HoaDon;
import com.example.waterbill.model.NguoiDung;
import com.example.waterbill.service.HoaDonService;
import com.example.waterbill.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {

    @Autowired
    private HoaDonService hoaDonService;

    @Autowired
    private NguoiDungService nguoiDungService;

    // Trang chủ
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // API tra cứu số nước tháng này (Không cần đăng nhập)
    @GetMapping("/tra-cuu")
    @ResponseBody
    public Optional<HoaDon> traCuuSoNuoc(@RequestParam int maNguoiDung) {
        LocalDate thangHienTai = LocalDate.now().withDayOfMonth(1);
        return hoaDonService.getHoaDonByMaHo(maNguoiDung, thangHienTai);
    }

    // API xem lịch sử hóa đơn (Yêu cầu đăng nhập)
    @GetMapping("/lich-su")
    @ResponseBody
    public List<HoaDon> lichSuHoaDon(@RequestParam int maNguoiDung) {
        Optional<NguoiDung> nguoiDung = nguoiDungService.getNguoiDungById(maNguoiDung);
        if (nguoiDung.isPresent()) {
            return hoaDonService.getHoaDonByUserId(maNguoiDung);
        }
        throw new RuntimeException("Bạn cần đăng nhập để xem lịch sử.");
    }
}
