package com.example.hoangduymanh.model;

public class BaseResponse<T> {
    public int status=1;
    public String mess="success";
    public T data;
}
