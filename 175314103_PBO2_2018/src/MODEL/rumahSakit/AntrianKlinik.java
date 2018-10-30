/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.rumahSakit;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class AntrianKlinik {

    private static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public ArrayList<Pasien> getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }

    public static ArrayList<AntrianKlinik> getDaftarAntrian() {
        return daftarAntrian;
    }

    public static void setDaftarAntrian(ArrayList<AntrianKlinik> daftarAntrian) {
        AntrianKlinik.daftarAntrian = daftarAntrian;
    }

    public void Mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntrian() == bulan
                    && daftarAntrian.get(i).getTahunAntrian() == tahun
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                return i;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        return String.valueOf(tanggalAntrian) + String.valueOf(bulanAntrian)
                + String.valueOf(tahunAntrian) + klinik.getNama() + klinik.getIdKlinik();

    }

    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {
        if (cariAntrian(tanggal, bulan, tahun, klinik)>=0) {
            daftarAntrian.get(cariAntrian (tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        }else{
            buatAntrian(tanggal, bulan, tahun, klinik);
            daftarAntrian.get(cariAntrian(tanggal,bulan,tahun, klinik)).Mendaftar(pasien);
      
           
        }
        
        
    

 {

        }
    }
}
