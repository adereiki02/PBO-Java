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

