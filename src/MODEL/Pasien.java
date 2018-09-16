/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Pasien {

    private String noRekamMedis,nama, alamat, tempat_lahir, nik;// membuat variable bertipe data Sting dan bersifat private
    private int  tanggal_lahir, bulan_lahir, tahun_lahir;// membuat variable bertipe data int dan bersifat private
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien(String nama, String alamat, String tempat_lahir, int tanggal_lahir, int bulan_lahir, int tahun_lahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempat_lahir = tempat_lahir;
        this.tanggal_lahir = tanggal_lahir;
        this.bulan_lahir = bulan_lahir;
        this.tahun_lahir = tahun_lahir;
        this.nik = nik;
    }

    public ArrayList<Pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public void setDaftarPasienKlinik(ArrayList<Pasien> daftarPasienKlinik) {
        this.daftarPasienKlinik = daftarPasienKlinik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Pasien() {// membuat kunstruktor kosong

    }

    public Pasien(String Nama) {// membuat konstruktor bernama pasien 
        this.nama = Nama;
    }

    public String getNama() {//membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {//membuat method bernama getAlamat yang akan mereturn variabel bertipe data String
        return alamat;
    }

    public void setAlamat(String alamat) {//membuat method void bernama setAlamat dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }

    public String getTempat_lahir() {//membuat method bernama getTempat_lahir yang akan mereturn variabel bertipe data String
        return tempat_lahir;
    }

    public void setTempat_lahir(String tempat_lahir) {//membuat method void bernama setTempat_lahir dengan parameter variabel tempat_lahir bertipe data String
        this.tempat_lahir = tempat_lahir;
    }

    public String getNoRekamMedis() {//membuat method bernama getNoRekamMedis yang akan mereturn variabel bertipe data String
        return noRekamMedis;
    }

    /**
     * public void setNoRekamMedis(String noRekamMedis) throws Exception {
     * //membuat method void bernama setNoRekamMedis dengan parameter variabel
     * noRekamMedis bertipe data integer dengan menambahkan throws Exception if
     * (noRekamMedis.length() >= 6) { this.noRekamMedis = noRekamMedis; } else {
     * throw new Exception("eror"); } }
     *
     */
    public int getTanggal_lahir() {//membuat method bernama getTanggal_lahir yang akan mereturn variabel bertipe data int
        return tanggal_lahir;
    }

    public void setTanggal_lahir(int tanggal_lahir) throws Exception {
        //membuat method void bernama setTanggal_lahir dengan parameter variabel tanggal_lahir bertipe data integer dengan menambahkan throws Exception
        if (tanggal_lahir > 0) {
            if (tanggal_lahir <= 31) {
                this.tanggal_lahir = tanggal_lahir;
            } else {
                throw new Exception("eror");
            }
        }

    }

    public int getBulan_lahir() {//membuat method bernama getBulan_lahir yang akan mereturn variabel bertipe data int
        return bulan_lahir;
    }

    public void setBulan_lahir(int bulan_lahir) throws Exception {
        //membuat method void bernama setBulan_lahir dengan parameter variabel bulan_lahir bertipe data integer dengan menambahkan throws Exception
        if (bulan_lahir > 0) {
            if (bulan_lahir <= 12) {
                this.bulan_lahir = bulan_lahir;
            } else {
                throw new Exception("eror");
            }
        } else {
            throw new Exception("eror");
        }
    }

    public int getTahun_lahir() {//membuat method bernama getTahun_lahir yang akan mereturn variabel bertipe data int
        return tahun_lahir;
    }

    public void setTahun_lahir(int tahun_lahir) throws Exception {
//membuat method void bernama setTahun_lahir dengan parameter variabel tahun_lahir bertipe data integer dengan menambahkan throws Exception
        if (tahun_lahir > 0) {
            this.tahun_lahir = tahun_lahir;
        } else {
        }

    }

    public String buatNomorRekamMedis() {//membuat method bernama buatNomorRekamMedis yang akan mereturn variabel bertipe data String
        // pada method ini berfungsi untuk menampilkan data tahun,bulan, dan tanggal pada hari itu serta menampilkan 3 huruf depan pasien
        String nomorRekamMedis;
        
        nomorRekamMedis = nik;
        return nomorRekamMedis;
    }

    public static void daftarPasienKlinik(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String noRekamMedis) {
        boolean found = false;
        Pasien result = null;

        for (int i = 0; i < daftarPasienKlinik.size() && found == false; i++) {
            if (daftarPasienKlinik.get(i).nik.equals(noRekamMedis)) {
                found = true;
                result = daftarPasienKlinik.get(i);

            }
        }
        return result;
    }
}
