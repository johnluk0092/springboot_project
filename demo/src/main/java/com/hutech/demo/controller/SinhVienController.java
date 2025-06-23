package com.hutech.demo.controller;

import com.hutech.demo.model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVienController {
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();

    @GetMapping("/sinhvien")
    public String showForm(Model model) {
        model.addAttribute("sinhVien", new SinhVien());
        return "sinhvien/form-sinhvien";
    }

    @PostMapping("/sinhvien")
    public String submitForm(@ModelAttribute SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
        return "redirect:/sinhvien/result";
    }

    @GetMapping("/sinhvien/result")
    public String showResult(Model model) {
        model.addAttribute("danhSachSinhVien", danhSachSinhVien);
        return "sinhvien/result-sinhvien";
    }
}
