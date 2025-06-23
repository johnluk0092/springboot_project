package com.hutech.demo.model;

public class SinhVien {
    private String ten;
    private int tuoi;
    private String khoa;

    // Constructors
    public SinhVien() {}

    public SinhVien(String ten, int tuoi, String khoa) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.khoa = khoa;
    }

    // Getters and Setters (REQUIRED for Thymeleaf)
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
}