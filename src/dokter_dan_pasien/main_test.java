/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokter_dan_pasien;

/**
 *
 * @author lenovo
 */
public class main_test {
    public static void main(String[] args) {
        
        pasien pas1 = new pasien ("Syelen");
        dokter dok1 = new dokter ("James");
        
        
        try {
            pas1.setAlamat("Paingan");
            pas1.setTempat_lahir("Lubuklinggau");
            pas1.setTanggal_lahir(17);
            pas1.setBulan_lahir(7);
            pas1.setTahun_lahir(1999);
            pas1.setNoRekamMedis(pas1.buatNomorRekamMedis());
            
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
        System.out.println("No Rekam Medis  :"+pas1.getNoRekamMedis());
        System.out.println("");
        
        System.out.println("---Dokter---");
         System.out.println("Nama           :"+dok1.getNama());
         System.out.println("Nomor Pegawai  :"+dok1.getNomorPegawai());
        System.out.println("Alamat          :"+dok1.getAlamat());
        System.out.println("Tempat Lahir    :"+dok1.getTempat_lahir());
        System.out.println("Tanggal Lahir   :"+dok1.getTanggal_lahir()+pas1.getBulan_lahir()+pas1.getTahun_lahir());
        
        
        }
        }
    

