/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author lenovo
 */
public class dokter { 
    
    
    private String nomorPegawai, nama, alamat, tempat_lahir;
  //mendeklarasikan variable bertipe data String dan bersifat private
    private int bulan_lahir, tahun_lahir, tanggal_lahir;
    //mendeklarasikan variable bertipe data int dan bersifat private

    public dokter(){// membuat konstruktor kosong bernama dokter
    }
       public dokter(String nama) {// membuat konstruktor kosong bernama dokter 
           this.nama=nama;
       }

    public int getBulan_lahir() {//membuat method bernama getBulan_lair yang akan mereturn variabel bertipe data int
        return bulan_lahir;
    }
    
    public void setBulan_lahir(int bulan_lahir) throws Exception {
//membuat method void bernama setBulan_lahir dengan parameter variabel bulan_lahir bertipe data integer dengan menambahkan throws Exception
      
        if (bulan_lahir <= 12) { // method ini berfungsi untuk menentukan batasan data yang akan dioutput
            this.bulan_lahir = bulan_lahir;
        } else {
            throw new Exception("eror");
        }
        
    }
    
    public int getTahun_lahir() {//membuat method bernama getTahun_lair yang akan mereturn variabel bertipe data int
        return tahun_lahir;
    }
    
    public void setTahun_lahir(int tahun_lahir) throws Exception {
        //membuat method void bernama setTahun_lahir dengan parameter variabel tahun_lahir bertipe data integer dengan menambahkan throws Exception
 
        if (tahun_lahir > 0) {
            this.tahun_lahir = tahun_lahir;
        } else {
            throw new Exception("eror");
        }
        
    }
   
    
    public String getNomorPegawai() {//membuat method bernama getNomorPegawai yang akan mereturn variabel bertipe data String
        return nomorPegawai;
    }
    
    public void setNomorPegawai(String nomorPegawai) throws Exception { //membuat method void dengan menambahkan throws Exception
        if (nomorPegawai.length() == 6) {// method ini berfungsi untuk menentukan jumlah karakter pada NomorPegawai
            this.nomorPegawai = nomorPegawai + nama.substring(0, 3);
        } else {
            throw new Exception("eror");
        }
        
    }
    
    public String getNama() {//membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }
    
    public void setNama(String nama) {//membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }
    
    public String getAlamat() {//membuat method bernama getAlamat yang akan mereturn variabel bertipe data String
        return alamat;
    }
    
    public void setAlamat(String alamat) {//membuat method void bernama setAlamat dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }
    
    public String getTempat_lahir() {//membuat method bernama getTempat_lahir yang akan mereturn variabel bertipe data String
        return tempat_lahir;
    }
    
    public void setTempat_lahir(String tempat_lahir) {//membuat method void bernama setTempat_lahir dengan parameter variabel tempat_lahir bertipe data String
        this.tempat_lahir = tempat_lahir;
    }
    
    public int getTanggal_lahir() {//membuat method bernama getTanggal_lahir yang akan mereturn variabel bertipe data int
        return tanggal_lahir;
    }
    
    public void setTanggal_lahir(int tanggal_lahir) throws Exception {//membuat method void dengan menambahkan throws Exception
       // method ini berfungsi untuk menentukan batasan output data 
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