package com.example.contact.models;

import android.graphics.Bitmap;

public class user {
        private String hoTen;
        private String soDienThoai;
        private String diachi;


        public user(Bitmap hinhAnh, String hoTen, String soDienThoai) {
            this.hoTen = hoTen;
            this.soDienThoai = soDienThoai;
            this.diachi= diachi;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getSoDienThoai() {
            return soDienThoai;
        }

        public void setSoDienThoai(String soDienThoai) {
            this.soDienThoai = soDienThoai;
        }

        public String getDiachi() {
            return soDienThoai;
        }

        public void setDiachi(String soDienThoai) {
            this.diachi = diachi;
        }
    }

