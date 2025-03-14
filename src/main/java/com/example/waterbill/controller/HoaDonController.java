package com.example.waterbill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.waterbill.model.HoaDon;
import com.example.waterbill.service.HoaDonService;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hoadon")
public class HoaDonController {

    @Autowired
    private HoaDonService hoaDonService;

    // API tra cứu số nước tháng này (Không cần đăng nhập)
    @GetMapping("/tra-cuu")
    public Optional<HoaDon> getHoaDonByNguoiDung(@RequestParam int maNguoiDung) {
        LocalDate thangNam = LocalDate.now().withDayOfMonth(1);
        return hoaDonService.getHoaDonByMaHo(maNguoiDung, thangNam);
    }

    // API xem lịch sử hóa đơn (Yêu cầu đăng nhập)
    @GetMapping("/lich-su")
    public List<HoaDon> getLichSuHoaDon(@RequestParam int maNguoiDung, HttpSession session) {
        Object loggedUser = session.getAttribute("loggedUser");
        if (loggedUser == null) {
            throw new RuntimeException("Bạn cần đăng nhập để xem lịch sử hóa đơn.");
        }
        return hoaDonService.getHoaDonByUserId(maNguoiDung);
    }
}
