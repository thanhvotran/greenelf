package com.example.user.greenelf;

public class DataGarbage {
    private int HinhAnh;
    private String Ten;
    private String NguonGoc;
    private String PhanLoai;
    private String HuongDan;

    public DataGarbage(int hinhAnh, String ten, String nguonGoc) {
        HinhAnh = hinhAnh;
        Ten = ten;
        NguonGoc = nguonGoc;
    }

    public DataGarbage(int hinhAnh, String ten, String nguonGoc, String phanLoai, String huongDan) {
        HinhAnh = hinhAnh;
        Ten = ten;
        NguonGoc = nguonGoc;
        PhanLoai = phanLoai;
        HuongDan = huongDan;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNguonGoc() {
        return NguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        NguonGoc = nguonGoc;
    }

    public String getPhanLoai() {
        return PhanLoai;
    }

    public void setPhanLoai(String phanLoai) {
        PhanLoai = phanLoai;
    }

    public String getHuongDan() {
        return HuongDan;
    }

    public void setHuongDan(String huongDan) {
        HuongDan = huongDan;
    }


}
