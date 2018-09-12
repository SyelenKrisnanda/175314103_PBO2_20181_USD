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
 * @author admin
 */
public class antrianPasien {

    private Klinik klinik;
private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();
 

    public antrianPasien() {
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
     public void TanggalAntrian(){
         Date date = new Date();
         SimpleDateFormat tggl = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");
         System.out.println (tggl.format(date));
     }
   public void Mendaftar (Pasien Pasien){
       daftarPasienAntri.add(Pasien);
   }
}
    
