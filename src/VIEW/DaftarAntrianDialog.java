/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Pasien;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public final class DaftarAntrianDialog extends JDialog implements ActionListener {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMLabel;
    private JLabel alamat;
    private JTextField noRMText;
    private JTextField alamatText;
    private JTextField namaText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("PASIEN");//membuat label PASIEN
        judulLabel.setBounds(80, 35, 200, 25); // dengan ukuran x=80 dan y=35 serta panjang=200 dan tinggi=25
        this.add(judulLabel);

        this.setLayout(null);
        namaLabel = new JLabel("No Rekam Medis");// membuat label NO Rekam Medis
        namaLabel.setBounds(15, 80, 100, 25);// dengan ukuran x=15 dan y=80 serta panjang=100 dan tinggi=25
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 80, 120, 25);// dengan ukuran x=115 dan y=80 serta panjang=120 dan tinggi=25
        this.add(namaText);

        this.setLayout(null);
        namaLabel = new JLabel("Nama");// membuat label Nama
        namaLabel.setBounds(15, 125, 100, 25);// dengan ukuran x=15 dan y=125 serta panjang=100 dan tinggi=25
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 125, 120, 25);// dengan ukuran x=115 dan y=125 serta panjang=120 dan tinggi=25
        this.add(namaText);

        this.setLayout(null);
        alamat = new JLabel("Alamat");// membuat label Alamat
        alamat.setBounds(15, 180, 100, 25);// dengan ukuran x=15 dan y=180 serta panjang=100 dan tinggi=25
        this.add(alamat);

        namaText = new JTextField();
        namaText.setBounds(115, 180, 120, 25);// dengan ukuran x=115 dan y=180 serta panjang=120 dan tinggi=25
        this.add(namaText);

        this.setLayout(null);
        saveButton = new JButton("Simpan");// membuat tombol Simpan
        saveButton.setBounds(115, 300, 100, 40);// dengan ukuran x=115 dan y=300 serta panjang=100 dan tinggi=40
        this.add(saveButton);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // sebagai perbandingan apabila tombol yang di klik adalah noRMText
        if (ae.getSource() == noRMText) {
            //mencari object pasien berdasarakan noRMText
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
        // sebagai  perbandingan apabila tombol yang di klik adalah antriButton
        if (ae.getSource() == saveButton) {
            //mencari object pasien berdasarakan noRMText
            Pasien cari = Pasien.cariPasien(noRMText.getText());
            // melakukan perulangan sebanyak indeks pada daftarpasien
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                //perbandingan apabila object cari sama dengan object dari daftar pasien indeks ke i
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
