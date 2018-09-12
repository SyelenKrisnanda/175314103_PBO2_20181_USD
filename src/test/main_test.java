package test;

import MODEL.dokter;
import MODEL.Pasien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author lenovo
 */
public class main_test {
    public static void main(String[] args) {
        
        Pasien pas1 = new Pasien ("Syelen");
        dokter dok1 = new dokter ("James");
        
        
        try {
            pas1.setAlamat("Paingan");
            pas1.setTempat_lahir("Lubuklinggau");
            pas1.setTanggal_lahir(17);
            pas1.setBulan_lahir(7);
            pas1.setTahun_lahir(1999);
            pas1.setNik("175314896");
            
            dok1.setNomorPegawai("147842");
            dok1.setTempat_lahir("Yogyakarta");
            dok1.setTanggal_lahir(31);
            dok1.setBulan_lahir(3);
            dok1.setTahun_lahir(1990);
                     
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("---PASIEN---");
        System.out.println("Nama            :"+pas1.getNama());
        System.out.println("Alamat          :"+pas1.getAlamat());
        System.out.println("Tempat Lahir    :"+pas1.getTempat_lahir());
        System.out.println("Tanggal Lahir   :"+pas1.getTanggal_lahir()+pas1.getBulan_lahir()+pas1.getTahun_lahir());
        System.out.println("No Rekam Medis  :"+pas1.buatNomorRekamMedis());
        System.out.println("");
        
        System.out.println("---Dokter---");
         System.out.println("Nama           :"+dok1.getNama());
         System.out.println("Nomor Pegawai  :"+dok1.getNomorPegawai());
        System.out.println("Alamat          :"+dok1.getAlamat());
        System.out.println("Tempat Lahir    :"+dok1.getTempat_lahir());
        System.out.println("Tanggal Lahir   :"+dok1.getTanggal_lahir()+pas1.getBulan_lahir()+pas1.getTahun_lahir());
        
        
        }
        }
    

