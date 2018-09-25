/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class AntrianPasien {

    private Klinik klinik;
    private int tanggalLahir, bulanLahir, tahunLahir;
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
    private static ArrayList<AntrianPasien> daftarAntrian = new ArrayList<AntrianPasien>();

    public AntrianPasien() {
    }

    public AntrianPasien(Klinik klinik, int tanggalLahir, int bulanLahir, int tahunLahir) {
        this.klinik = klinik;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
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

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public ArrayList<AntrianPasien> getDaftarAntrian() {
        return daftarAntrian;
    }

    public void setDaftarAntrian(ArrayList<AntrianPasien> daftarAntrian) {
        this.daftarAntrian = daftarAntrian;
    }

    public void Mendaftar(Pasien Pasien) {
        daftarPasienAntri.add(Pasien);
    }

    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) {

    }

    public static AntrianPasien cariPasien(String noRM) {
        AntrianPasien a = new AntrianPasien();
        return a;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
     AntrianPasien obj= new AntrianPasien();
     obj.setTanggalLahir(tanggal);
     obj.setBulanLahir(bulan);
     obj.setTahunLahir(tahun);
     obj.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik)==-1) {
            daftarAntrian.add(obj); 
            
        }else{
            JOptionPane.showMessageDialog(null, "Antrian Sudah Ada");
            
        }
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {// pake siz7we karena nyari panjang araynya
            if (tanggal== daftarAntrian.get(i).getTanggalLahir() && bulan == daftarAntrian.get(i).getBulanLahir() 
                    && tahun==daftarAntrian.get(i).getTahunLahir() 
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(klinik.getNama())
                    && daftarAntrian.get(i).getKlinik().getIdKlinik()==klinik.getIdKlinik()) {
                return i;
            }
        }
        return -1;
    
    
    }
}
