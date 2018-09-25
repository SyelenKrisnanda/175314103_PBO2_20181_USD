/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Pasien {

    private String noRekamMedis, nama, alamat, tempatLahir, nik;// membuat variable bertipe data Sting dan bersifat private
    private int tanggalLahir, bulanLahir, tahunLahir;// membuat variable bertipe data int dan bersifat private
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien() {

    }

    public Pasien(String nama, String alamat, String tempat_lahir, int tanggal_lahir,
            int bulan_lahir, int tahun_lahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempat_lahir;
        this.tanggalLahir = tanggal_lahir;
        this.bulanLahir = bulan_lahir;
        this.tahunLahir = tahun_lahir;
        this.nik = nik;
    }

    public static ArrayList<Pasien> getDaftarPasienKlinik() {
        return daftarPasienKlinik;
    }

    public static void setDaftarPasienKlinik(ArrayList<Pasien> daftarPasienKlinik) {
        Pasien.daftarPasienKlinik = daftarPasienKlinik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
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

    public String getTempatLahir() {//membuat method bernama getTempat_lahir yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }

    public void setTempatLahir(String tempat_lahir) {//membuat method void bernama setTempat_lahir dengan parameter variabel tempatLahir bertipe data String
        this.tempatLahir = tempat_lahir;
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
     * @return 
     */
    public int getTanggalLahir() {//membuat method bernama getTanggal_lahir yang akan mereturn variabel bertipe data int
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggal_lahir) throws Exception {
        //membuat method void bernama setTanggal_lahir dengan parameter variabel tanggalLahir bertipe data integer dengan menambahkan throws Exception
        if (tanggal_lahir > 0) {
            if (tanggal_lahir <= 31) {
                this.tanggalLahir = tanggal_lahir;
            } else {
                throw new Exception("eror");
            }
        }

    }

    public int getBulanLahir() {//membuat method bernama getBulan_lahir yang akan mereturn variabel bertipe data int
        return bulanLahir;
    }

    public void setBulanLahir(int bulan_lahir) throws Exception {
        //membuat method void bernama setBulan_lahir dengan parameter variabel bulanLahir bertipe data integer dengan menambahkan throws Exception
        if (bulan_lahir > 0) {
            if (bulan_lahir <= 12) {
                this.bulanLahir = bulan_lahir;
            } else {
                throw new Exception("eror");
            }
        } else {
            throw new Exception("eror");
        }
    }

    public int getTahunLahir() {//membuat method bernama getTahun_lahir yang akan mereturn variabel bertipe data int
        return tahunLahir;
    }

    public void setTahunLahir(int tahun_lahir) throws Exception {
//membuat method void bernama setTahun_lahir dengan parameter variabel tahunLahir bertipe data integer dengan menambahkan throws Exception
        if (tahun_lahir > 0) {
            this.tahunLahir = tahun_lahir;
        } else {
        }

    }

    public String buatNomorRekamMedis() {//membuat method bernama buatNomorRekamMedis yang akan mereturn variabel bertipe data String
        // pada method ini berfungsi untuk menampilkan data tahun,bulan, dan tanggal pada hari itu serta menampilkan 3 huruf depan pasien
        String nomorRekamMedis;

        nomorRekamMedis = nik;
        return nomorRekamMedis;
    }

    public static void tambahPasienBaru(Pasien pasien) {
        daftarPasienKlinik.add(pasien);
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).noRekamMedis.equalsIgnoreCase(noRM)) {
                return daftarPasienKlinik.get(i);
            }
        }
        return null;
    }
}
