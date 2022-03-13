/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucPham;

import java.util.Date;

/**
 *
 * @author HoaiAnh
 */
public abstract class ThucPham {
    private String maSP;
    private String tenSP;
    private Date ngayNhap;
    private int soLuong;
    private float giaBan;
    public ThucPham() {
    }

    public ThucPham(String maSP, String tenSP, Date ngayNhap, int soLuong, float giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }
    
    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    
}
