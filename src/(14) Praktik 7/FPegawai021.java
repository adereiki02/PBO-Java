import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.sql.*;

public class FPegawai021 extends JFrame implements ActionListener
{
    public JPanel       pPgw       = new JPanel();
    private JLabel      lNip       = new JLabel("N I P"),
                        lNama      = new JLabel("Nama"),
                        lBagian    = new JLabel("Bagian"),
                        lcreate    = new JLabel("nama");
    private JTextField  fNip       = new JTextField(),
                        fNama      = new JTextField(),
                        fBagian    = new JTextField();
    private JButton     btnAdd     = new JButton(),
                        btnCari    = new JButton(),
                        btnKoreksi = new JButton(),
                        btnHapus   = new JButton(),
                        btnSelesai = new JButton();

    public FPegawai021(){
        setPreferredSize(new Dimension(450, 300));
        setTitle("Data Pegawai");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane pPgw = new JDesktopPane();

        /* Mengatur letak objek label di container */
        lNip.setBounds(15, 20, 100, 25);
        lNama.setBounds(15, 55, 100, 25);
        lBagian.setBounds(15, 90, 100, 25);
        lcreate.setBounds(150, 225, 260, 25);
        lcreate.setText("Created by Ade Reiki Karuna A12.2020.06455");

        /* Mengatur letak objek Text di container */
        fNip.setBounds(115, 20, 100, 25);
        fNama.setBounds(115, 55, 205, 25);
        fBagian.setBounds(115, 90, 92, 25);
        fNip.setToolTipText("Isi Nip dengan Angka !");

        /* Mengatur letak objek Button di container */
        // koord x , y , panjang, lebar
        btnAdd.setBounds(20, 150, 85, 25);
        btnAdd.setText("Add");
        btnAdd.setBackground(Color.BLUE);
        btnAdd.setForeground(Color.getHSBColor(250, 0, 255));
        btnCari.setBounds(120, 150, 85, 25);
        btnCari.setText("Cari");
        btnKoreksi.setBounds(220, 150, 85, 25);
        btnKoreksi.setText("Koreksi");
        btnHapus.setBounds(220, 185, 85, 25);
        btnHapus.setText("Hapus");
        btnSelesai.setBounds(320, 150, 80, 60);
        btnSelesai.setText("Selesai");
        btnSelesai.setToolTipText("Mengakhiri Program");

        /* Objek Button di Non Aktifkan dan di Aktifkan */
        btnAdd.setEnabled(true);
        btnSelesai.setEnabled(true);
    

        // mengatur objek untuk dapat berinteraksi
        btnAdd.addActionListener(this);
        btnCari.addActionListener(this);
        btnKoreksi.addActionListener(this);
        btnHapus.addActionListener(this);
        btnSelesai.addActionListener(this);

        /* Meletakkan seluruh komponen pada Panel  */
        pPgw.add (lNip);
        pPgw.add (fNip);
        pPgw.add (lNama);
        pPgw.add (fNama);
        pPgw.add (lBagian);
        pPgw.add (fBagian);
        pPgw.add (lcreate);
        pPgw.add (btnAdd);
        pPgw.add (btnCari);
        pPgw.add (btnKoreksi);
        pPgw.add (btnHapus);
        pPgw.add (btnSelesai);

        /* menambahkan panel pada Frame */
        getContentPane().add(pPgw).setBackground(Color.getHSBColor(100, 150, 75));

        /* Menampilkan frame ke layar monitor */
        pack();
        Kosong();
        settombol(1, 1, 0, 0, 1);
    }

    //program utama
    public static void main(String[] args) {
        new FPegawai021().setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        Object obj = ae.getSource();

        //saat dipilih tambah/add
        if (obj == btnAdd){
            if (btnAdd.getText() == "Simpan"){
                String xnip = fNip.getText();
                if (xnip.length() != 0)
                    Add();
                else
                    JOptionPane.showMessageDialog(this, "Nip kosong !");
                btnAdd.setText("Add");
                Kosong();
                settombol(1, 1, 0, 0, 1);
            }
           else {
               Kosong();
               settombol(1, 0, 0, 0, 1);
               btnAdd.setText("Simpan");
               btnAdd.setForeground(Color.getHSBColor(100, 10, 0));
               btnAdd.setBackground(Color.getHSBColor(200, 100, 100));
           }
        }

        //saat dipilih cari
        if (obj == btnCari){
            String xcari = JOptionPane.showInputDialog(this, "Masukkan Nip !");
            if (xcari != null)
            {
                fNip.setText(xcari);
                int xx = Cari();
                if (xx == 1) settombol(1, 1, 1, 1, 1);
    		}
    		else
    		    JOptionPane.showMessageDialog(this, "Nip kosong !");
        }

        //saat dipilih koreksi
        if (obj == btnKoreksi)
    	{
    		if (btnKoreksi.getText()=="Simpan")
    		{
    			if (fNip.getText() != "") 
                    Koreksi();
    			btnKoreksi.setText("Koreksi");
    			Kosong();
    			settombol(1, 1, 0, 0, 1);
    		}

    		else
    		{
    			btnKoreksi.setText("Simpan");
    			settombol(0, 0, 1, 0, 1);
    			fNama.requestFocus();
    		}
    	}

        //saat dipilih hapus
        if (obj == btnHapus)
    	{
    		int stt = JOptionPane.showConfirmDialog(this,"Yakin dihapus ?");
    		System.out.print(stt);
    		
    		if (stt == 0)
    		{
    			Hapus();
    			Kosong();
    		}
    	}

        //saat dipilih selesai
        if (obj == btnSelesai)
    	{
    		System.exit(0);
    	}
    }

    // Fungsi untuk menambahkan data ke tabel barang
    void Add()
    {
        try
        {
            JOptionPane.showMessageDialog(this, "Proses untuk Add!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Penambahan Gagal!!!");
        }
    }

    // Fungsi untuk mencari NIP
    int Cari()
    {
        int x = 0;
        return x;
    }

    // Fungsi untuk melakukan koreksi data
    void Koreksi()
    {
        try
        {
            JOptionPane.showMessageDialog(this, "Sukses DiEdit !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Koreksi Gagal !");
        }
    }

    // Fungsi untuk menghapus data
    void Hapus()
    {
        try
        {
            JOptionPane.showMessageDialog(this, "Data Terhapus !");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Penghapusan Gagal !");
        }
    }

    // Fungsi untuk mengkosongkan data
    void Kosong ()
    {
        fNip.setText("");
        fNama.setText("");
        fBagian.setText("");
        fNip.requestFocus();
    }

    void settombol(int a, int b, int c, int d, int e)
    {
        btnAdd.setEnabled(a>=1 ? true: false);
        btnCari.setEnabled(a>=1 ? true: false);
        btnKoreksi.setEnabled(a>=1 ? true: false);
        btnHapus.setEnabled(a>=1 ? true: false);
        btnSelesai.setEnabled(a>=1 ? true: false);
    }
}