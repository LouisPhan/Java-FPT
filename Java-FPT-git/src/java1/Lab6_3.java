/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author MyPC
 */
class SinhVien{
    private String hoTen;
    private String email;
    private String phone;
    private String cmnd;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    void Nhap(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("*****Nhap thong tinh sinh vien*********");
        
//Ho ten sinh vien
        System.out.println("Nhap ho ten: ");
        setHoTen(scan.nextLine());
//Nhap email
        String checkEmail = "^[a-zA-Z]+\\w*@{1}[a-zA-Z]+mail.com";    
        System.out.println("Nhap dia chi email");
        setEmail(scan.nextLine());
        while(!getEmail().matches(checkEmail)){
            System.out.println("Email trong hoac sai dinh dang");
            setEmail(scan.nextLine());
        }
        
//So dien thoai
        String checkPhone = "(0)\\d{9}";
        System.out.println("Nhap so dien thoai: ");
        setPhone(scan.nextLine());
        while(!getPhone().matches(checkPhone)){
            System.out.println("So dien thoai khong duoc trong hoac sai dinh dang");
            setPhone(scan.nextLine());
        }
//CMND
        String checkID = "\\d{12}";
        System.out.println("Nhap CMND: ");
        setCmnd(scan.nextLine());
        while(!getCmnd().matches(checkID)){
            setCmnd(scan.nextLine());
        }
        System.out.println("========================================");
    }
    
    void Xuat(){
        System.out.println();
        System.out.println("*******Thong tin sinh vien**********");
        System.out.println("Ho va Ten: " + getHoTen());
        System.out.println("Email: " + getEmail());
        System.out.println("so dien thoai: "+ getPhone());
        System.out.println("CMND: " + getCmnd());
    }
}

public class Lab6_3 {
    public static void main(String[] args) {
        ArrayList<SinhVien> sinhVien = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            SinhVien sv = new SinhVien();
            sv.Nhap();
            sinhVien.add(sv);
        }
        
        sinhVien.forEach((x) -> {
            x.Xuat();
        });
    }
     
}
