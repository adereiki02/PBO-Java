import java.util.Scanner;

class Peserta{

    //atribut
    String kode, nama, institusi, telp, email, alamat, deskripsi, cetak_jenis, cetak_biaya;
    int pilih,jenis, biaya;

    //method
    //set untuk menentukan nilai
    public void setJenisPeserta(int jenis)
    {
        this.jenis = jenis;

        if (jenis == 1){
            biaya = 500000;
            cetak_biaya = "Rp. " + biaya;
            cetak_jenis = "Dosen/Umum";
            deskripsi   = "Peserta untuk kalangan Dosen dan Umum";
        } 
        else if (jenis == 2)
        {
            biaya = 200000;
            cetak_biaya = "Rp. " + biaya;
            cetak_jenis = "Mahasiswa";
            deskripsi   = "Peserta untuk kalangan Mahasiswa";
        }
    }

    //get untuk mengambil nilai dari set
    public String getJenisPeserta() {
        this.cetak_jenis = cetak_jenis;
        return this.cetak_jenis;
    }

    public String getDeskripsi() {
        this.deskripsi = deskripsi;
        return this.deskripsi;
    }

    public String getBiaya() {
        this.cetak_biaya = cetak_biaya;
        return this.cetak_biaya;
    }
}


class PesertaBaru extends Peserta{

    //atribut
    String cetak_diskon;
    double potongan;
    double biaya_final;
    String cetak_final;

    //method
    //set
    public void setDiskon(int jenis) {

        if (jenis == 1){
            cetak_diskon = "10%";
        } 
        else if (jenis == 2)
        {
            cetak_diskon = "30%";
        }
    }


    public void setFinalBiaya(int jenis) {
        if (jenis == 1){
            potongan    = 0.1 * 500000; //potongan 10%
            biaya_final = biaya - potongan;

            //konversi ke integer 
            int xbiaya_final = (int)biaya_final;
            cetak_final = "Rp. " + String.valueOf(xbiaya_final);
            
        }
        else if (jenis == 2){
            potongan = 0.3 * 200000; //potongan 30%
            biaya_final = biaya - potongan;

            //konversi ke integer 
            int xbiaya_final = (int)biaya_final;
            cetak_final = "Rp. " + String.valueOf(xbiaya_final); 
        }

    }

    //get
    public String getCetak_diskon() {
        this.cetak_diskon = cetak_diskon;
        return this.cetak_diskon;
    }
    public String getFinalBiaya() {
        this.cetak_final = cetak_final;
        return this.cetak_final;
    }
}

//main program 
public class DemoPeserta {
    public static void main(String[] args)
    {
        PesertaBaru x = new PesertaBaru();
        Scanner oscan01 = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("   Pendaftaran Webinar UDINUS 2022");
        System.out.println("======================================");
        System.out.print("Kode                : ");
        x.kode = oscan01.nextLine();

        System.out.print("Nama                : ");
        x.nama = oscan01.nextLine();

        System.out.print("Institusi           : ");
        x.institusi = oscan01.nextLine();

        System.out.print("Email               : ");
        x.email = oscan01.nextLine();

        System.out.print("No HP               : ");
        x.telp = oscan01.nextLine();

        System.out.print("Alamat              : ");
        x.alamat = oscan01.nextLine();

        System.out.print("Jenis Peserta [1/2] : ");
        x.pilih = oscan01.nextInt();
        x.setJenisPeserta(x.pilih);

        //clearscreen
        System.out.print("\033[H\033[2J");
        System.out.flush();


        
        //output
        System.out.println("======================================");
        System.out.println("       Detail Pendaftaran Webinar");
        System.out.println("======================================");
        System.out.println("Kode Peserta     : " + x.kode);
        System.out.println("Nama             : " + x.nama);
        System.out.println("Institusi        : " + x.institusi);
        System.out.println("No HP            : " + x.telp);
        System.out.println("Email            : " + x.email);
        System.out.println("Alamat           : " + x.alamat);


        System.out.println("Jenis Peserta    : " + x.getJenisPeserta() );
        System.out.println("Deskripsi        : " + x.getDeskripsi() );
        System.out.println("Biaya            : " + x.getBiaya() );

        //menentukan diskon dari hasil jenis peserta
        x.setDiskon(x.pilih);
        System.out.println("Potongan Harga   : " + x.getCetak_diskon() );

        //menentukan biaya final dari hasil jenis peserta dan diskon yang didapat
        x.setFinalBiaya(x.pilih);
        System.out.println("Total Biaya      : " + x.getFinalBiaya() );


    }
}
    

