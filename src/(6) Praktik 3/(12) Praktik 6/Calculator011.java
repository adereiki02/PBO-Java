import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JToggleButton.ToggleButtonModel;

public class Calculator011 extends JFrame implements ActionListener
{
    private JPanel      jpCalculator    = new JPanel();

    private JTextField  fLayar          = new JTextField();
    private JLabel      labelmhs        = new JLabel ("NIM:A12.2020.06455 | Nama : Ade Reiki Karuna");

    private JButton     btnTambah       = new JButton ("+"),
                        btnKurang       = new JButton ("-"),
                        btnKali         = new JButton ("*"),
                        btnBagi         = new JButton ("/"),
                        btnC            = new JButton ("C"),
                        btn0            = new JButton ("0"),
                        btn1            = new JButton ("1"),
                        btn2            = new JButton ("2"),
                        btn3            = new JButton ("3"),
                        btn4            = new JButton ("4"),
                        btn5            = new JButton ("5"),
                        btn6            = new JButton ("6"),
                        btn7            = new JButton ("7"),
                        btn8            = new JButton ("8"),
                        btn9            = new JButton ("9"),
                        btnKoma         = new JButton ("."),
                        btnSama         = new JButton ("=");

    private String isiLayar = "";
    private String snilai1, snilai2, tombol;
    private int pilih;
    private double hasil;
    private int hasil_int;
    Font font1 = new Font("SansSerif", Font.BOLD, 24);

    public Calculator011() {
        setPreferredSize(new Dimension(500, 600));
        setTitle("Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        new BorderLayout();
        JDesktopPane jpCalculator = new JDesktopPane();
        add(jpCalculator, BorderLayout.CENTER);

        /* Mengatur letak objek Text Di Container */
        // (koord x, koord y, panjang, tinggi)
        fLayar.setBounds (50, 90, 385, 50);
        fLayar.setFont(font1);
        labelmhs.setBounds(50, 480, 300, 50);

        /* Mengatur letak objek Button Di Container */
        btnC.setBounds (350, 160, 85, 50);
        btnKali.setBounds (350, 230, 85, 50);
        btnBagi.setBounds (350, 300, 85, 50);
        btnTambah.setBounds (350, 370, 85, 50);
        btnKurang.setBounds (350, 440, 85, 50);


        btnSama.setBounds (250, 440, 85, 50);
        btnKoma.setBounds (150, 440, 85, 50);
        //btnSama.setLabel("="); 

        //btnAdd.setToolTipText ("Tombol Tambah Data");
        
        //baris ke-2
        btn7.setBounds (50, 230, 85, 50);
        btn8.setBounds (150, 230, 85, 50);
        btn9.setBounds (250, 230, 85, 50);


        //baris ke-3
        btn4.setBounds (50, 300, 85, 50);
        btn5.setBounds (150, 300, 85, 50);
        btn6.setBounds (250, 300, 85, 50);


        //baris ke-3
        btn1.setBounds (50, 370, 85, 50);
        btn2.setBounds (150, 370, 85, 50);
        btn3.setBounds (250, 370, 85, 50);


        //baris ke-4
        btn0.setBounds (50, 440, 85, 50);


        fLayar.setHorizontalAlignment(JTextField.RIGHT);

        /* Objek Button di Non Aktifkan dan Di Aktifkan */
        btnTambah.setEnabled(true);
        btnKurang.setEnabled(true);
        btnKali.setEnabled(true);
        btnBagi.setEnabled(true);
        btnKoma.setEnabled(true);

        /* Mengatur objek untuk dapat berinteraksi */
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        btnC.addActionListener(this);
        btnSama.addActionListener(this);
        btnKoma.addActionListener(this);
        btnTambah.addActionListener(this);
        btnKurang.addActionListener(this);
        btnKali.addActionListener(this);
        btnBagi.addActionListener(this);

        // Meletakkan seluruh kontrol pada objek panel */
        jpCalculator.add (fLayar);
        jpCalculator.add (labelmhs);
        jpCalculator.add (btn0);
        jpCalculator.add (btn1);
        jpCalculator.add (btn2);
        jpCalculator.add (btn3);
        jpCalculator.add (btn4);
        jpCalculator.add (btn5);
        jpCalculator.add (btn6);
        jpCalculator.add (btn7);
        jpCalculator.add (btn8);
        jpCalculator.add (btn9);

        jpCalculator.add (btnKali);
        jpCalculator.add (btnBagi);
        jpCalculator.add (btnTambah);
        jpCalculator.add (btnKurang);
        jpCalculator.add (btnC);
        jpCalculator.add (btnSama);
        jpCalculator.add (btnKoma);

        /* Menambahkan objek panel (jpCalculator) ke container frame */
        getContentPane().add(jpCalculator).setBackground(Color.getHSBColor(10, 50, 200));
        
        /* Menampilkan frame ke layar monitor */
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator011().setVisible(true);
    }

    /* Fungsi jika user melakukan action penekanan tombol Button */
    public void actionPerformed (ActionEvent ae) {
        Object obj = ae.getSource();


        if (obj == btnC)
        {
            tombol = ""; snilai1 = ""; snilai2 = "";
            isiLayar = "";
            fLayar.setText(isiLayar);
        }

        if (obj == btn0)
        {
            isiLayar = isiLayar + "0";
            fLayar.setText(isiLayar);
        }

        if (obj == btn1)
        {
            isiLayar = isiLayar + "1";
            fLayar.setText(isiLayar);
        }

        if (obj == btn2)
        {
            isiLayar = isiLayar + "2";
            fLayar.setText(isiLayar);
        }

        if (obj == btn3)
        {
            isiLayar = isiLayar + "3";
            fLayar.setText(isiLayar);
        }

        if (obj == btn4)
        {
            isiLayar = isiLayar + "4";
            fLayar.setText(isiLayar);
        }

        if (obj == btn5)
        {
            isiLayar = isiLayar + "5";
            fLayar.setText(isiLayar);
        }

        if (obj == btn6)
        {
            isiLayar = isiLayar + "6";
            fLayar.setText(isiLayar);
        }

        if (obj == btn7)
        {
            isiLayar = isiLayar + "7";
            fLayar.setText(isiLayar);
        }

        if (obj == btn8)
        {
            isiLayar = isiLayar + "8";
            fLayar.setText(isiLayar);
        }

        if (obj == btn9)
        {
            isiLayar = isiLayar + "9";
            fLayar.setText(isiLayar);
        }

        //mendeklarasikan nilai var pilih ditiap button
        if (obj == btnTambah)
        {
            tombol   = "tambah";
            snilai1  = fLayar.getText();
            isiLayar = "";
            fLayar.setText(isiLayar);
            pilih = 1;
        }

        if (obj == btnKurang)
        {
            tombol   = "kurang";
            snilai1  = fLayar.getText();
            isiLayar = "";
            fLayar.setText(isiLayar);
            pilih = 2;
        }

        if (obj == btnKali)
        {
            tombol   = "kali";
            snilai1  = fLayar.getText();
            isiLayar = "";
            fLayar.setText(isiLayar);
            pilih = 3;
        }

        if (obj == btnBagi)
        {
            tombol   = "bagi";
            snilai1  = fLayar.getText();
            isiLayar = "";
            fLayar.setText(isiLayar);
            pilih = 4;
        }

        if (obj == btnKoma)
        {
            tombol   = "koma";
            isiLayar = isiLayar + ".";
            fLayar.setText(isiLayar);
        }


        if (obj == btnSama)
        {
            snilai2 = fLayar.getText();

            // saat ditekan tombol =

            // menggunakan switch case dengan memanggil fungsi method rumus
            switch(pilih){
                case 1:
                methodTambah();
                break;

                case 2:
                methodKurang();
                break;

                case 3:
                methodKali();
                break;

                case 4:
                methodBagi();
                break;

            }

            
            if (tombol == "koma")
            {
                String shasil = "" + hasil;
                fLayar.setText(shasil);
            }
            else
            {
                String shasil = "" + hasil_int;
                fLayar.setText(shasil);
            }
            
            
        }

    } //tutup methode public void actionPerformed

    //fungsi method rumus

            void methodTambah()
            {
                if (tombol == "koma")
                {
                    hasil = Double.parseDouble(snilai1) + Double.parseDouble(snilai2);
                }
                else
                {
                    hasil = Integer.parseInt(snilai1) + Integer.parseInt(snilai2);
                    hasil_int = (int)hasil;
                }
            }
            
            void methodKurang()
            {
                if (tombol == "koma")
                {
                    hasil = Double.parseDouble(snilai1) - Double.parseDouble(snilai2);
                }
                else
                {
                    hasil = Integer.parseInt(snilai1) - Integer.parseInt(snilai2);
                    hasil_int = (int)hasil;
                }
            }
        
            void methodKali()
            {
                if (tombol == "koma")
                {
                    hasil = Double.parseDouble(snilai1) * Double.parseDouble(snilai2);
                }
                else
                {
                    hasil = Integer.parseInt(snilai1) * Integer.parseInt(snilai2);
                    hasil_int = (int)hasil;
                }
            }
        
            void methodBagi()
            {
                if (tombol == "koma")
                {
                    hasil = Double.parseDouble(snilai1) / Double.parseDouble(snilai2);
                }
                else
                {
                    hasil = Integer.parseInt(snilai1) / Integer.parseInt(snilai2);
                    hasil_int = (int)hasil;
                }
            }
    




    //fungsi untuk mengkosongkan objek layar tampilan
    void kosong()
    {
        fLayar.setText ("");
        fLayar.requestFocus ();
    }
}

