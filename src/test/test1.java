/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import MODEL.Pasien;

/**
 *
 * @author admin
 */
public class test1 {

    public static void main(String[] args) {
        Pasien test = new Pasien(
                "Puspa", // nama pasien
                "Klaten", // alamat
                "Medan", // tempat lahir
                12, // tanggal lahir
                01, // bulan lahir
                1974, // tahun lahir
                "19740112" // NIK
        );

        Pasien test1 = new Pasien(
                "Budi", // nama pasien
                "Klaten", // alamat
                "Klaten", // tempat lahir
                10, // tanggal lahir
                01, // bulan lahir
                1999, // tahun lahir
                "19990110" // NIK
        );

    Pasien.daftarPasienKlinik(test);
        Pasien.daftarPasienKlinik(test1);

        for (int i = 0; i < Pasien.tambahPasienBaru.size(); i++) {
            System.out.println("Nama : " + Pasien.tambahPasienBaru.get(i).getNama());
        }

        Pasien cari = Pasien.cariPasien("19990110");
        System.out.println("Nama Hasil Pencarian = " + cari.getNama());
    }
}
