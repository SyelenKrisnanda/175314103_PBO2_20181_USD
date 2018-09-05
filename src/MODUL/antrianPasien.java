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
public class antrianPasien {
    private int tanggalAntrian, BulanAntrian, tahunAntiran;
private pasien DaftarPasien[];
  private Klinik klinik;

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return BulanAntrian;
    }
    
    public void setBulanAntrian(int bulanAntrian) throws Exception {
        if (BulanAntrian<= 12) {
            this.BulanAntrian = bulanAntrian;
        } else {
            throw new Exception("eror");
        }
    }
    public int getTahunAntiran() {
        return tahunAntiran;
    }

    public void setTahunAntiran(int tahunAntrian) throws Exception {
     if (tahunAntrian >0){
            this.tahunAntiran = tahunAntiran;
        }else{
            throw new Exception ("eror");
        }
        
    }

    public pasien getDaftarPasien() {
        return DaftarPasien[3];
    }

    public void setDaftarPasien(pasien DaftarPasien) {
        this.DaftarPasien[3] = DaftarPasien;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    
  
}
