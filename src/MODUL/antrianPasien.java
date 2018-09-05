/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL;

/**
 *
 * @author admin
 */
public class antrianPasien {
    private int tanggalAntrian; // membuat variable bertipe data int dan bersifat private
    private int bulanAntrian; // membuat variable bertipe data int dan bersifat private
    private int tahunAntrian; // membuat variable bertipe data int dan bersifat private
      private Klinik klinik; // membuat variable bertipe data klinik dan bersifat private
    private pasien daftarPasien[]; // membuat variable bertipe data pasien dan bersifat private
    

    /**
     * 
     * @return 
     */
    public int getTanggalAntrian() {//membuat method bernama getTanggalAntrian yang akan mereturn variabel bertipe data int
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {//membuat method void bernama setTanggalAntrian dengan parameter variabel tanggalAntrian bertipe data int
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {//membuat method bernama getBulanAntrian yang akan mereturn variabel bertipe data int
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {//membuat method void bernama setBulanAntrian dengan parameter variabel bulanAntrian bertipe data int
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {//membuat method bernama geTahunAntrian yang akan mereturn variabel bertipe data int
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {//membuat method void bernama setTahunAntrian dengan parameter variabel tahunAntrian bertipe data int
        this.tahunAntrian = tahunAntrian;
    }

    public Klinik getklinik() {//membuat method bernama getKlinik yang akan mereturn variabel bertipe data klinik
        return klinik;
    }

    public void setklinik(Klinik Klinik) {//membuat method void bernama setKlinik dengan parameter variabel Klinik bertipe data klinik
        this.klinik = Klinik;
    }

    public pasien[] getDaftarPasien() {//membuat method bernama getDaftarPasien yang akan mereturn variabel bertipe data pasien[]
        return daftarPasien;
    }

    public void setDaftarPasien(pasien[] daftarPasien) {//membuat method void bernama setDaftarPasien dengan parameter variabel daftarPasien bertipe data pasien[]
        this.daftarPasien = daftarPasien;
    }
  
}
