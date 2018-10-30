/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.rumahSakit;

import MODEL.Klinik;
import static MODEL.Klinik.daftarKlinik;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class RumahSakit {
    String nama;
    String alamat;
    public static ArrayList<Pasien> DaftarPasien = new ArrayList<Pasien>();
 public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
 public static ArrayList<Klinik> daftarAntrianKlinik = new ArrayList<Klinik>();


    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    public void tambahPasien (Pasien pasien){
     DaftarPasien.add(pasien);
    }
    public Pasien cariPasien(String noRm){
        return null;
        
    }
    public void tambahPasienBaru (Pasien test){
    
    }
     public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;// buat objek stream yaitu fos

        try {
            fos = new FileOutputStream(file, false); // ojek baru (fos) untuk tujuan
            for (int i = 0; i < DaftarPasien.size(); i++) {//berapa banyak data yang sudah ditambah
                String data = DaftarPasien.get(i).toString(); // toString ini suda ada nama dan alamat di ovveride
                fos.write(data.getBytes());// untuk buat nulis di file.txt
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public String toString() {
        return ("Pasien : " + "\t" + nama + "\t" + alamat + "\n");
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasilBaca = "";
        int data;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        Pasien text = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((data = fis.read()) != -1) {// 
                if ((char) data != '\n') {
                    if ((char) data != '\t') {
                        hasilBaca = hasilBaca + (char) data;
                    } else {
                        if (noRM == false) {// untuk mendeteksi noRm
                            text.setNoRekamMedis(hasilBaca);
                            noRM = true;//sudah benar / sudah di set
                            hasilBaca = "";// dikembalikan ke 0
                        } else if (nama == false) {//untuk mendeteksi nama
                            text.setNama(hasilBaca);
                            nama = true;
                            hasilBaca = "";// dikempabikan ke 0
                        }
                    }
                } else {
                    text.setAlamat(hasilBaca);
                    alamat = true;
                    hasilBaca = "";
                    Pasien.tambahPasienBaru(text);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    text = new Pasien();// objek baru untk membedakan data yang sudah ada pada table
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
    public void simpanObjekRumahSakit (File file){
    }
    public void bacaObjekRumahSkit (File file){
    }

    public static ArrayList<Pasien> getDaftarPasien() {
        return DaftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> DaftarPasien) {
        RumahSakit.DaftarPasien = DaftarPasien;
    }
    public static void tambahKlinik(Klinik klinik) {
        daftarKlinik.add(klinik);
    }

    public static Klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarKlinik.size(); i++) {
            if (daftarKlinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return daftarKlinik.get(i);
            }
        }
        return null;
    }
    public  static void  buatAntrian (int tanggal, int bulan, int tahun, Klinik klinik){
    }
    public static  int cariAntrian (int tanggal, int bulan, int tahun, Klinik klinik){
        return 0;
    }
    public static void daftarPasien (Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik){
    }

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        RumahSakit.daftarKlinik = daftarKlinik;
    }

    public static ArrayList<Klinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public static void setDaftarAntrianKlinik(ArrayList<Klinik> daftarAntrianKlinik) {
        RumahSakit.daftarAntrianKlinik = daftarAntrianKlinik;
    }
    
}