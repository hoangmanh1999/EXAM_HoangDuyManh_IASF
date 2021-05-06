package com.example.hoangduymanh.service;

import com.example.hoangduymanh.entity.SinhVien;
import com.example.hoangduymanh.respository.SinhVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienImpl implements SinhVienService {
    @Autowired
    SinhVienRepo sinhVienRepo;

    @Override
    public List<SinhVien> GetAllSinhVien(){
        return sinhVienRepo.findAll();
    }

    @Override
    public List<SinhVien> getSinhVienByName(String name){
       return null;
    }

    @Override
    public SinhVien create(SinhVien s){
         return null;
    }
}
