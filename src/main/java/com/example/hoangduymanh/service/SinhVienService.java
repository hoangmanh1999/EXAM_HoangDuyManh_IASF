package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.SinhVien;

import java.util.List;

public interface SinhVienService {
    List<SinhVien> GetAllSinhVien();
    List<SinhVien> getSinhVienByName(String name);
    SinhVien create(SinhVien s);
}
