/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

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
        String checkEmail = "\\w+@\\w+(\\.\\w){1,2}";
        System.out.println("Nhap email: ");
        setEmail(scan.nextLine());
        if(!getEmail().equals(checkEmail)){
            setEmail(scan.nextLine());
        }
        
//So dien thoai
        String checkPhone = "(0||+84)[0-9]{9}";
        System.out.println("Nhap so dien thoai: ");
        setPhone(scan.nextLine());
        if(!getPhone().equalsIgnoreCase(checkPhone)){
            setPhone(scan.nextLine());
        }
//CMND
        String checkID = "[0-9]{12}";
        System.out.println("Nhap CMND: ");
        setCmnd(scan.nextLine());
        while(getCmnd().equalsIgnoreCase(checkID)){
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
    
}
