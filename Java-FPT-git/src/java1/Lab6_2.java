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
class SanPham{
   private String tenSP;
   private String hang;
   private double donGia;
   void Nhap(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Nhap thong tin san pham");
       
       System.out.println("Nhap ten san pham: ");
       setTenSP(scan.nextLine());
       
       
       System.out.println("Nhap hang san xuat: ");
       setHang(scan.nextLine());
       
       System.out.println("Nhap don gia san pham: ");
       setDonGia(scan.nextFloat());
   }

   void Xuat(){
       System.out.println("Ten san pham: " + getTenSP());
       System.out.println("Hang san xuat: " + getHang());
       System.out.println("Don gia: " + getDonGia());
   }
   
    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}
public class Lab6_2 {
    public static void main(String[] args) {
        ArrayList<SanPham> sanPham = new ArrayList();
        
        for(int i = 0; i < 3; i++){
            SanPham sp = new SanPham();
            sp.Nhap();
            sanPham.add(sp);
        }
        
        for(SanPham x: sanPham){
            if(x.getHang().equals("Nokia")){
                x.Xuat();
            }
        }
    }
}
