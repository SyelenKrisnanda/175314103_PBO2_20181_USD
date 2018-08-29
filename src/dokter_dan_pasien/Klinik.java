/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokter_dan_pasien;

/**
 *
 * @author admin
 */
public class Klinik {
    private int idKlinik;

    public int getIdKlinik() {
        return idKlinik;
    }

    public void setIdKlinik(int idKlinik) throws Exception {
        if (idKlinik > 6){
              this.idKlinik = idKlinik;
        }else{
            throw new Exception ("eror");
        }
      
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    private String Nama;
}
