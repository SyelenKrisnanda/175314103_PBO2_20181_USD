/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrianBaru extends JDialog {

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel alamat;
    private JTextField namaText;
    private JButton saveButton;

    public DaftarAntrianBaru() {
        init();
    }

    public DaftarAntrianBaru(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR PASIEN BARU");
        judulLabel.setBounds(80, 35, 200, 25);
        this.add(judulLabel);

        this.setLayout(null);
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(15, 125, 100, 25);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 125, 120, 25);
        this.add(namaText);

        this.setLayout(null);
        alamat = new JLabel("Alamat");
        alamat.setBounds(15, 180, 100, 25);
        this.add(alamat);

        namaText = new JTextField();
        namaText.setBounds(115, 180, 120, 25);
        this.add(namaText);

        this.setLayout(null);
        saveButton = new JButton("Simpan");
        saveButton.setBounds(115, 300, 100, 40);
        this.add(saveButton);
    }
}
