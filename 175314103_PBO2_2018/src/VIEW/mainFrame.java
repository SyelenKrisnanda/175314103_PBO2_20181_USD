/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author admin
 */
public class mainFrame extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenuItem tambahPasienMenu;
    private JMenuItem dataPasien;
    private JMenuItem tambahAntrianMenu;
    private JMenuBar fileMenu;
    private JMenuItem exitMenuItem;

    public mainFrame() {
        init();
    }

    public void init() {

        menuBar = new JMenuBar();
        this.setTitle("Main Frame");
        pasienMenu = new JMenu("Pasien");
        tambahPasienMenu = new JMenuItem("Tambah Pasien");
        tambahAntrianMenu = new JMenuItem("Antrian Pasien");
        dataPasien = new JMenuItem("Data Pasien");
        exitMenuItem = new JMenuItem("Exit");

        menuBar.add(pasienMenu);
        pasienMenu.add(dataPasien);
        pasienMenu.add(tambahPasienMenu);
        pasienMenu.add(tambahAntrianMenu);
        pasienMenu.add(exitMenuItem);

        this.setJMenuBar(menuBar);

        tambahPasienMenu.addActionListener(this);
        tambahAntrianMenu.addActionListener(this);
        dataPasien.addActionListener(this);
        exitMenuItem.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tambahPasienMenu) {
            DaftarAntrianPasien test = new DaftarAntrianPasien("FORM PASIEN");// membuat judul pada form yaitu FORM PASIEN
            test.setSize(400, 450); //dengan ukuran x=400 dan y= 450
            test.setVisible(true);
        }
        if (ae.getSource() == tambahAntrianMenu) {
            tambahPasien test1 = new tambahPasien("FORM ANTRIAN");// membuat judul pada form yaitu FORM ANTRIAN
            test1.setSize(400, 600);//dengan ukuran x=400 dan y= 600
            test1.setVisible(true);
        }
        if (ae.getSource() == dataPasien) {
            DaftarAntrianDialog test2 = new DaftarAntrianDialog("FORM DATA PASIEN ");// membuat judul pada form yaitu FORM DATA PASIEN
            test2.setSize(400, 450);//dengan ukuran x=400 dan y= 450
            test2.setVisible(true);
        }
        if (ae.getSource() == exitMenuItem) {
            System.exit(0);
        }
    }
}
