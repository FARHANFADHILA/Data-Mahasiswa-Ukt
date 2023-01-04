package org.Ukt;

import java.time.LocalDate;
import java.time.Period;

public class OOPNYA {
    private String Nama;
    private LocalDate Tanggallahir;
    private Long Ukt;

    public OOPNYA() {
    }

    public OOPNYA(String nama, LocalDate tanggallahir, Long ukt) {
        Nama = nama;
        Tanggallahir = tanggallahir;
        Ukt = ukt;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public LocalDate getTanggallahir() {
        return Tanggallahir;
    }

    public void setTanggallahir(LocalDate tanggallahir) {
        Tanggallahir = tanggallahir;
    }

    public Long getUkt() {
        return Ukt;
    }

    public void setUkt(Long ukt) {
        Ukt = ukt;
    }
    // menghitung Umur
    public String umur(){
        LocalDate dob = Tanggallahir;
        LocalDate curDate = LocalDate.now();
        Period Jangkaumur = Period.between(dob,curDate);
        String usia = Jangkaumur.getYears() + "TAHUN" + Jangkaumur.getMonths() + "BULAN" + Jangkaumur.getDays();
        return usia;
    }
    //kategori ukt
    public String Jenisukt(){
        if(Ukt < 500000){
            return "UKT 1";
        }
        else if(Ukt >= 500000 && Ukt <= 1500000 ){
            return "UKT 2";
        }
        else if (Ukt >= 1500000 && Ukt <= 3000000){
            return "UKT 3";
        }
        else if(Ukt >= 3000000 && Ukt <= 4500000){
            return "UKT 4";
        }
        else if (Ukt >= 4500000 && Ukt <= 5000000 ){
            return "UKT 5";
        }
        else if (Ukt >= 5000000 && Ukt <= 6000000){
            return "UKT 6";
        }
        else if ( Ukt >= 6000000 && Ukt <= 7000000){
            return "UKT 7";
        }else{
            return "Tidak terdaftar";
        }
    }

}
