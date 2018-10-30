 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import MODEL.*;
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
public class Pasien {

    private String noRekamMedis, nama, alamat, tempatLahir, nik;// membuat variable bertipe data Sting dan bersifat private
    private int tanggalLahir, bulanLahir, tahunLahir;// membuat variable bertipe data int dan bersifat private
    public static ArrayList<Pasien> bacaDaftarPasien = new ArrayList<Pasien>();

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

    public static ArrayList<Pasien> getDaftarPasien() {
        return bacaDaftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> daftarPasienKlinik) {
        Pasien.bacaDaftarPasien = daftarPasienKlinik;
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

    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        //membuat method void bernama setNoRekamMedis dengan parameter variabel
        // noRekamMedis bertipe data integer dengan menambahkan throws Exception 
        if (noRekamMedis.length() >= 6) {
            this.noRekamMedis = noRekamMedis;
        } else {
            throw new Exception("eror");
        }
        return;
    }

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
        bacaDaftarPasien.add(pasien);
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < bacaDaftarPasien.size(); i++) {
            if (bacaDaftarPasien.get(i).noRekamMedis.equalsIgnoreCase(noRM)) {
                return bacaDaftarPasien.get(i);
            }
        }
        return null;
    }

    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;// buat objek stream yaitu fos

        try {
            fos = new FileOutputStream(file, false); // ojek baru (fos) untuk tujuan
            for (int i = 0; i < bacaDaftarPasien.size(); i++) {//berapa banyak data yang sudah ditambah
                String data = bacaDaftarPasien.get(i).toString(); // toString ini suda ada nama dan alamat di ovveride
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

    /**
     * method ini membuat kita lebih mudah saat akan menampilkannya di main
     *
     */
    public void printInfo() {
        System.out.printf("%-25s", "Nomor Rekam Medis Pasien: ");
        System.out.println(": " + getNoRekamMedis());
        System.out.printf("%-25s", "Nama Pasien: ");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir: ");
        System.out.print(": " + getTempatLahir() + " , ");
        getTanggalLahir();
        getBulanLahir();
        getTahunLahir();
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.println("");
    }

}
