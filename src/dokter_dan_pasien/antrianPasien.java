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
public class antrianPasien {
    private int tanggalAntrian, BulanAntrian, tahunAntiran;

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }

    public int getBulanAntrian() {
        return BulanAntrian;
    }
    
    public void setBulan_lahir(int bulanAntrian) throws Exception {
        if (BulanAntrian<= 12) {
            this.BulanAntrian = bulanAntrian;
        } else {
            throw new Exception("eror");
        }
    }
    public int getTahunAntiran() {
        return tahunAntiran;
    }

    public void setTahunAntiran(int tahunAntiran) {
        this.tahunAntiran = tahunAntiran;
    }

    public String getDaftarPasien() {
        return DaftarPasien;
    }

    public void setDaftarPasien(String DaftarPasien) {
        this.DaftarPasien = DaftarPasien;
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    private String DaftarPasien;
    private Klinik klinik;
}
