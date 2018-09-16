/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianBaru extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamat;
    private JLabel noRMLabel;
    private JTextField noRMText;
    private JTextField alamatText;
     private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JComboBox tanggalComboBox;
    private JComboBox bulanComboBox;
    private JComboBox tahunComboBox;
    private String tanggalArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    private String bulanArray[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12"};
    private String tahunArray[] = {"1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002"};
    private JTextField namaText;
    private JButton saveButton;

    public DaftarAntrianBaru() {
        //sebagai konstruktor yang memmanggil method init
        init();
    }
/**
 * 
 * @param title 
 */
    public DaftarAntrianBaru(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR PASIEN BARU");// membuat Label "DAFTAR PASIEN BARU"
        judulLabel.setBounds(100, 35, 200, 25);// dengan ukuran x=100 dan y=35 serta panjang=200 dan tinggi=25
        this.add(judulLabel);

        this.setLayout(null);
        namaLabel = new JLabel("Nama");// membuat label "Nama"
        namaLabel.setBounds(15, 80, 100, 25);// dengan ukuran x=15 dan y=80 serta panjang=100 dan tinggi=25
        this.add(namaLabel);

        namaText = new JTextField();// untuk  membuat kotak teks
        namaText.setBounds(115, 80, 180, 25);// dengan ukuran x=115 dan y=80 serta panjang=180 dan tinggi=25
        this.add(namaText);

        this.setLayout(null);
        alamat = new JLabel("Alamat");// membuat label "Alamat"
        alamat.setBounds(15, 130, 100, 25);// dengan ukuran x=15 dan y=130 serta panjang=100 dan tinggi=25
        this.add(alamat);

        namaText = new JTextField();// untuk membuat kotak teks
        namaText.setBounds(115, 130, 180, 80);// dengan ukuran x=115 dan y=130 serta panjang=180 dan tinggi=80
        this.add(namaText);
        
        tanggalLahirLabel = new JLabel("Tanggal Lahir :");//membuat label Tanggal Lahir
        tanggalLahirLabel.setBounds(20,235 , 100, 20);// dengan ukuran x=20 dan y=235 serta panjang=100 dan tinggi=20
        this.add(tanggalLahirLabel);
        
       tanggalLahirLabel = new JLabel("Tanggal ");// membuat Label Tanggal
        tanggalLahirLabel.setBounds(54, 290, 80, 20);// dengan ukuran x=54 dan y=290 serta panjang=80 dan tinggi=20
        this.add(tanggalLahirLabel);

       tanggalComboBox = new JComboBox(tanggalArray);// membuat comboBox untuk memilih tanggal
        tanggalComboBox.setBounds(56, 310, 40, 20);// dengan ukuran x=56 dan y=310 serta panjang=40 dan tinggi=20
        this.add(tanggalComboBox);

        bulanLahirLabel = new JLabel("Bulan");// membuat label Bulan
        bulanLahirLabel.setBounds(157, 290, 80, 20);// dengan ukuran x=157 dan y=290 serta panjang=80 dan tinggi=20
        this.add(bulanLahirLabel);

       bulanComboBox = new JComboBox(bulanArray);// membuat comboBoc untuk memilih bulan
        bulanComboBox.setBounds(154, 310, 40, 20);// dengan ukuran x=154 dan y=310 serta panjang=40 dan tinggi=20
        this.add(bulanComboBox);

       tahunLahirLabel = new JLabel("Tahun");// membuat label Tahun
        tahunLahirLabel.setBounds(255, 290, 80, 20);// dengan ukuran x=255 dan y=290 serta panjang=80 dan tinggi=20
        this.add(tahunLahirLabel);

       tahunComboBox = new JComboBox(tahunArray);// membuat comboBox untuk memilih tahun
        tahunComboBox.setBounds(245, 310, 60, 20);// dengan ukuran x=245 dan y=310 serta panjang=60 dan tinggi=20
        this.add(tahunComboBox);

        this.setLayout(null);
        saveButton = new JButton("Simpan");// membuat tombol Simpan
        saveButton.setBounds(115, 350, 100, 40);// dengan ukuran x=115 dan y=350 serta panjang=100 dan tinggi=40
        this.add(saveButton);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // sebagai perbandingan apabila yang di klik adalah noRMText
        if (ae.getSource() == noRMText) {
            //mencari object pasien berdasarakan noRM
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            //perbandingan apabila object cari sama dengan null
            if (cari == null) {
                // menampilkan text pada jendela dialog
                JOptionPane.showMessageDialog(null, "Data Pasien " + noRMText.getText() + " Tidak Ada");
            } else {
                //mengset namatext dengan data dari variabel nama dari object cari
                namaText.setText(cari.getNama());
                //mengset alamattext dengan data dari variabel alamat dari object cari
                alamatText.setText(cari.getAlamat());
            }
        }
        // perbandingan apabila yang di klik adalah antriButton
        if (ae.getSource() == saveButton) {
            //mencari object pasien berdasarakan noRM
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            //perulangan sebanyak indeks pada daftarpasien
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                //perbandingan apabila object cari sama dengan object dari daftar pasie indeks ke i
                if (cari == Pasien.daftarPasienKlinik.get(i)) {
                    // menampilkan text pada jendela dialog
                    JOptionPane.showMessageDialog(null, "Nomor Antrian Anda : " + (i + 1));
                    //method agar jdialog langsung keluar 
                    this.dispose();
                }
            }
        }
    }
}    
  

