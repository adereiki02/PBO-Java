//class mahasiswa
class Mhs {
    //property....
    private String nama;
    private float ipk;

    //setter
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setIpk(int ipk)
    {
        this.ipk = ipk;
    }

    //getter
    public String getNama()
    {
        return this.nama;
    }

    public float getIpk()
    {
        return this.ipk;
    }
}

public class Latihan05b
{
    public static void main(String[] args)
    {
        Mhs mhsAdi = new Mhs();
        mhsAdi.setNama("Adi Sanjaya");
        System.out.print("Nama Mhs : " + mhsAdi.getNama());
    }
}
