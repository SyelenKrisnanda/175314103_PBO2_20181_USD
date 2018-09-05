/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODUL;

/**
 *
 * @author admin
 */
public class Klinik {

    private String Nama;// membuat variable bertipe data Sting dan bersifat private
    private int idKlinik;// membuat variabel bertipe data int dan bersifat iprivate

    public String getNama() {//membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return Nama;
    }

    public void setNama(String Nama) {//membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.Nama = Nama;
    }

    public int getIdKlinik() {//membuat method bernama getIdKlinik yang akan mereturn variabel bertipe data int
        return idKlinik;
    }

    public void setIdKlinik(int idKlinik) throws Exception { // Membuat method bernama setIdKlinik dengan parameter variable idKlinik bertipe data int dengan menambahkan eception
        if (idKlinik > 6) {
            this.idKlinik = idKlinik;
        } else {
            throw new Exception("eror");
        }

    }
}
