class Peserta{

    //atribut
    String kode, nama, institusi, telp, email, alamat, deskripsi, cetak_jenis, cetak_biaya;
    int pilih,jenis, biaya;

    //method
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


    

