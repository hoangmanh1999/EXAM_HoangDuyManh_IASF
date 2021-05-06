package com.example.hoangduymanh.respository;

import com.example.hoangduymanh.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SinhVienRepo extends JpaRepository<SinhVien,Integer> {
    SinhVien findbyname(String name);
    @Query("select s from SinhVien s where s.name like %:name%")
    List<SinhVien> findSinhVienByName(String name);
}
