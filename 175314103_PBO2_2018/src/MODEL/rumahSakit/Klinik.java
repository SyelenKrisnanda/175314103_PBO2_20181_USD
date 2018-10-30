/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.rumahSakit;

import MODEL.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Klinik {

    private String Nama;// membuat variable bertipe data Sting dan bersifat private
    private String idKlinik;// membuat variabel bertipe data int dan bersifat iprivate
    public static ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();

    public Klinik(){
        
    }

    public Klinik(String Nama, String idKlinik) {
        this.Nama = Nama;
        this.idKlinik = idKlinik;
    }

    public static ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public static void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        Klinik.daftarKlinik = daftarKlinik;
    }

    public String getNama() {//membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return Nama;
    }

    public void setNama(String Nama) {//membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.Nama = Nama;
    }

    public String getIdKlinik() {//membuat method bernama getIdKlinik yang akan mereturn variabel bertipe data int
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) throws Exception { // Membuat method bernama setIdKlinik dengan parameter variable idKlinik bertipe data int dengan menambahkan eception
        if (idKlinik.length() > 6) {
            this.idKlinik = idKlinik;
        } else {
            throw new Exception("eror");
        }

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
}