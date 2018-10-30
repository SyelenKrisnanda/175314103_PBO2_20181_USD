/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;
        import MODEL.Pasien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.omg.CORBA.ORB;
import static org.omg.CORBA.ORB.init;

/**
 *
 * @author lenovo
 */
public class tambahPasien extends JDialog implements ActionListener{

    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRMText;
    private JLabel alamat;
    private JLabel nik;
    private JLabel jenisKelamin;
    private JRadioButton priaRadioButton;
    private JRadioButton wanitaRadioButton;
    private ButtonGroup groupButtonGroup;
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
    private JTextField nikText;
    private JTextField alamatText;
    private JButton saveButton;

    public tambahPasien() {
        //merupakan kunstruktor
        init();
    }

    public tambahPasien(String title) {
        this.setTitle(title);
        init();

    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("FROM TAMBAH PASIEN");// membuat label FORM TAMBAH PASIEN
        judulLabel.setBounds(115, 35, 200, 25);//dengan ukuran x=115 dan y=35 serta panjang=200 dan tinggi=25
        this.add(judulLabel);

        this.setLayout(null);
        nik = new JLabel("NIK");// membuat label NIK
        nik.setBounds(15, 80, 100, 25); //dengan ukuran x=15 dan y=80 serta panjang=100 dan tinggi=25
        this.add(nik);

        nikText = new JTextField();// untuk membuat kotak teks
        nikText.setBounds(115, 80, 180, 25);//dengan ukuran x=115 dan y=80 serta panjang=180 dan tinggi=25
        this.add(nikText);

        this.setLayout(null);
        namaLabel = new JLabel("Nama");// membuat label Nama
        namaLabel.setBounds(15, 130, 100, 25);//dengan ukuran x=15 dan y=130 serta panjang=100 dan tinggi=25
        this.add(namaLabel);

        namaText = new JTextField();// untuk membuat kotak teks
        namaText.setBounds(115, 130, 180, 25);//dengan ukuran x=115 dan y=130 serta panjang=180  dan tinggi=25
        this.add(namaText);

        this.setLayout(null);
        alamat = new JLabel("Alamat");// membuat label Alamat
        alamat.setBounds(15, 180, 100, 25);//dengan ukuran x=15 dan y=180 serta panjang=100 dan tinggi=25
        this.add(alamat);

        alamatText = new JTextField();// untuk membuat kotak teks
        alamatText.setBounds(115, 180, 180, 80);//dengan ukuran x=115 dan y=180 serta panjang=180 dan tinggi=80
        this.add(alamatText);
        
        jenisKelamin= new JLabel("Jenis Kelamin ");// membuat label Jenis Kelamin
         jenisKelamin.setBounds(15, 280, 100, 20);//dengan ukuran x=15 dan y=280 serta panjang=100 dan tinggi=20
        this.add(jenisKelamin);

        
        priaRadioButton = new JRadioButton("Pria", true);// Membuat RadioButton dengan nama "Pria" 
         priaRadioButton.setBounds(120, 280, 50, 20);// Ukuran x = 120, y = 180 dan panjang = 50 tinggi 20
        this.add(priaRadioButton);

       
        wanitaRadioButton = new JRadioButton("Wanita", false); // Membuat RadioButton dengan nama "Perempuan"
        wanitaRadioButton.setBounds(120, 300, 70, 20);// Ukuran x = 120, y = 300 dan panjang = 120 tinggi 20
        this.add(wanitaRadioButton);

        // Membuat ButtonGroup untuk pengelompokan RadioButton
        groupButtonGroup = new ButtonGroup();
        groupButtonGroup.add(priaRadioButton);
        groupButtonGroup.add(wanitaRadioButton);

       
        tanggalLahirLabel = new JLabel("Tanggal Lahir :"); // Membuat label "Tanggal Lahir"
        tanggalLahirLabel.setBounds(20, 330, 100, 20);// dengan Ukuran x = 20, y = 330 dan panjang = 100 tinggi 20
        this.add(tanggalLahirLabel);
        
       
        tanggalLahirLabel = new JLabel("Tanggal "); // Membuat label "Tanggal"
        tanggalLahirLabel.setBounds(54, 370, 80, 20); // dengan Ukuran x = 54, y = 370 dan panjang = 80 tinggi 20
        this.add(tanggalLahirLabel);

       
        tanggalComboBox = new JComboBox(tanggalArray); //Membuat ComboBox untuk memilih urutan tanggal
        tanggalComboBox.setBounds(56, 390, 40, 20); // dengan Ukuran x = 56, y = 390 dan panjang = 40 tinggi 20
        this.add(tanggalComboBox);

       
        bulanLahirLabel = new JLabel("Bulan"); // Membuat label dengan nama "Bulan"
        bulanLahirLabel.setBounds(157, 370, 80, 20);  //dengan  Ukuran x = 157, y = 370 dan panjang = 80 tinggi 20
        this.add(bulanLahirLabel);

        bulanComboBox = new JComboBox(bulanArray);//Membuat ComboBox untuk memilih urutan bulan
        bulanComboBox.setBounds(154, 390, 40, 20);  // dengan Ukuran x = 154, y = 390 dan panjang = 40 tinggi 20
        this.add(bulanComboBox);

       
        tahunLahirLabel = new JLabel("Tahun"); // Membuat label dengan nama "Tahun"
        tahunLahirLabel.setBounds(255, 370, 80, 20); //dengan  Ukuran x = 255, y = 370 dan panjang = 80 tinggi 20
        this.add(tahunLahirLabel);

       
        tahunComboBox = new JComboBox(tahunArray); //Membuat ComboBox untuk memilih urutan tahun
        tahunComboBox.setBounds(245, 390, 60, 20);  //dengan  Ukuran x = 245, y = 390 dan panjang = 60 tinggi 20
        this.add(tahunComboBox);

        this.setLayout(null);
        saveButton = new JButton("Simpan");// membuat tombol Simpan
        saveButton.setBounds(120, 460, 100, 40);  //dengan  Ukuran x = 120, y = 460 dan panjang = 100 tinggi 40
        this.add(saveButton);
        saveButton.addActionListener(this);
        
        
    }
    @Override
     public void actionPerformed(ActionEvent e) {
        // perbandingan apabila yang di klik adalah tambahButton
        if (e.getSource() == saveButton) {
            //membuat object baru yang bertipe Pasien
            Pasien data = new Pasien();
            //mengset variabel nama untuk object baru
            data.setNama(namaText.getText());
            //mengset variabel alamat untuk object baru
            data.setAlamat(alamat.getText());
            //mengset variabel nik untuk object baru
            data.setNik(nik.getText());
            //menambahkan object baru ke daftarpasien melalui method tambahpasienbaru
            Pasien.bacaDaftarPasien.add(data);
            //menampilkan pesan 
            JOptionPane.showMessageDialog(null, "Data Anda Telah Ditambahkan");
            //method agar jdialog langsung keluar  
            this.dispose();
        }
    }

}


