//Latihan 05d 
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;


//deklarasi class
public class FHitungInput extends JFrame implements ActionListener{
    private JPanel      pPgw       = new JPanel();
    private JLabel      lNilai1    = new JLabel ("Nilai 1    "),
                        lNilai2    = new JLabel ("Nilai 2    "),
                        lHasil     = new JLabel ("Hasil      "),
                        lcreate    = new JLabel ("nama");
    private JTextField  fNilai1    = new JTextField (),
                        fNilai2    = new JTextField (),
                        fHasil     = new JTextField ();
    private JButton     btnTambah  = new JButton (),
                        btnKurang  = new JButton (),
                        btnBersih  = new JButton (),
                        btnSelesai = new JButton (),
                        btnKali    = new JButton (),
                        btnBagi    = new JButton ();

    public FHitungInput(){
        setPreferredSize(new Dimension(450, 280));
        setTitle("Form Hitung");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane pPgw = new JDesktopPane();

        /* Mengatur letak objek Label di container */
        lNilai1.setBounds (15, 20, 100, 25);
        lNilai2.setBounds (15, 55, 100, 25);
        lHasil.setBounds (15, 90, 100, 25);
        lcreate.setBounds (250, 210, 300, 25);
        lcreate.setText("dibuat oleh Ade Reiki Karuna - A12.2020.06455");


        /* Mengatur letak objek Text di container */
        fNilai1.setBounds (115, 20, 100, 25);
        fNilai2.setBounds (115, 55, 205, 25);
        fHasil.setBounds (115, 90, 92, 25);
        fNilai1.setToolTipText("Isi Nilai dengan Angka !");

        /* Mengatur letak objek Button di container */
        // coord x , coord y , width (panjang) , height (lebar)//
        btnTambah.setBounds (50, 150, 85, 25);
        btnTambah.setLabel("Tambah");
        btnTambah.setBackground(Color.red);
        btnTambah.setForeground(Color.getHSBColor(50,0,55));
        btnKurang.setBounds (150, 150, 85, 25);
        btnKurang.setLabel("Kurang");
        btnBersih.setBounds (250, 150, 75, 25);
        btnBersih.setLabel("Bersih");
        btnSelesai.setBounds (335, 150, 85, 25);
        btnSelesai.setLabel("Selesai");
        btnKali.setBounds (50, 200, 85, 25);
        btnKali.setLabel("Kali");
        btnBagi.setBounds (150, 200, 85, 25);
        btnBagi.setLabel("Bagi");

        btnSelesai.setToolTipText("Mengakhiri Program");

        /* Objek Button di Non Aktifkan dan di aktifkan */
        btnTambah.setEnabled(true);
        btnSelesai.setEnabled(true);

        // Mengatur objek untuk dapat berinteraksi
        btnTambah.addActionListener(this);
        btnKurang.addActionListener(this);
        btnBersih.addActionListener(this);
        btnSelesai.addActionListener(this);
        btnKali.addActionListener(this);
        btnBagi.addActionListener(this);

        // Meletakkan seluruh kontrol pada objek panel 
        pPgw.add (lNilai1);
        pPgw.add (fNilai1);
        pPgw.add (lNilai2);
        pPgw.add (fNilai2);
        pPgw.add (lHasil);
        pPgw.add (fHasil);
        pPgw.add (lcreate);
        pPgw.add (btnKurang);
        pPgw.add (btnTambah);
        pPgw.add (btnBersih);
        pPgw.add (btnSelesai);
        pPgw.add (btnKali);
        pPgw.add (btnBagi);

        // Menambahkan objek panel (pPgr) ke container frame 
        getContentPane().add(pPgw).setBackground(Color.getHSBColor(250,0,255));

        // Menampilkan frame ke layar monitor
        pack();
    }

    public static void main(String[] args){
        new FHitungInput().setVisible(true);
    }

    // Fungsi jika user melakukan action penekanan tombol Button 
    public void actionPerformed (ActionEvent ae){
        Object obj = ae.getSource();

        if (obj == btnTambah)
        {
            methodTambah();
        }

        if (obj == btnKurang)
        {
            methodKurang();
        }

        if (obj == btnBersih)
        {
            Kosong();
        }

        if (obj == btnSelesai)
        {
            System.exit(0);
        }

        if (obj == btnKali)
        {
            methodKali();
        }

        if (obj == btnBagi)
        {
            methodBagi();
        }

    }

    void methodTambah()
    {
        int xhasil = Integer.parseInt(fNilai1.getText()) + Integer.parseInt(fNilai2.getText());

        fHasil.setText (Integer.toString(xhasil));
    }

    void methodKurang()
    {
        int xhasil = Integer.parseInt(fNilai1.getText()) - Integer.parseInt(fNilai2.getText());

        fHasil.setText(Integer.toString(xhasil));
    }

    void methodKali()
    {
        int xhasil = Integer.parseInt(fNilai1.getText()) * Integer.parseInt(fNilai2.getText());

        fHasil.setText(Integer.toString(xhasil));
    }

    void methodBagi()
    {
        int xhasil = Integer.parseInt(fNilai1.getText()) / Integer.parseInt(fNilai2.getText());

        fHasil.setText(Double.toString(xhasil));
    }

    // Fungsi untuk mengkosongkan objek masukan
    void Kosong ()
    {
        fNilai1.setText ("");
        fNilai2.setText ("");
        fHasil.setText ("");
        fNilai1.requestFocus();
    }


}
