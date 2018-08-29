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
public class dokter {
    
    private String nomorPegawai, nama, alamat, tempat_lahir;
    private int bulan_lahir, tahun_lahir;
       private int tanggal_lahir;
    
    public dokter() {
        
    }
    
    public dokter(String nama) {
        this.nama = nama;
    }
    
    public int getBulan_lahir() {
        return bulan_lahir;
    }
    
    public void setBulan_lahir(int bulan_lahir) throws Exception {
        if (bulan_lahir <= 12) {
            this.bulan_lahir = bulan_lahir;
        } else {
            throw new Exception("eror");
        }
        
    }
    
    public int getTahun_lahir() {
        return tahun_lahir;
    }
    
    public void setTahun_lahir(int tahun_lahir) throws Exception {
        if (tahun_lahir > 0) {
            this.tahun_lahir = tahun_lahir;
        } else {
            throw new Exception("eror");
        }
        
    }
 
    
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    
    public void setNomorPegawai(String nomorPegawai) throws Exception {
        if (nomorPegawai.length() == 6) {
            this.nomorPegawai = nomorPegawai + nama.substring(0, 3);
        } else {
            throw new Exception("eror");
        }
        
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getTempat_lahir() {
        return tempat_lahir;
    }
    
    public void setTempat_lahir(String tempat_lahir) {
        this.tempat_lahir = tempat_lahir;
    }
    
    public int getTanggal_lahir() {
        return tanggal_lahir;
    }
    
    public void setTanggal_lahir(int tanggal_lahir) throws Exception {
        if (tanggal_lahir > 0) {
            
            if (tanggal_lahir <= 31) {
                this.tanggal_lahir = tanggal_lahir;
            } else {
                throw new Exception("eror");
            }
        } else {
            throw new Exception("eror");
            
        }
        
    }
    
}
