import java.util.Random;

public class Kendaraan {
    String merek, kerusakan, jenis;
    int tahunProduksi;
    double harga;
    String[] listKerusakan = {"Mesin", "Eksterior", "Interior"};
    public Kendaraan(String merek, int tahunProduksi, double harga) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }
    public void setRandomKerusakan(){
        Random random = new Random();
        this.kerusakan = listKerusakan[random.nextInt(3)];
    }

    public void info_spesifikasi(){
        System.out.println("Merek " + this.jenis +" : " +this.merek );
        System.out.println("Tahun Produksi " + this.jenis +" : " +this.tahunProduksi );
        System.out.println("Harga " + this.jenis +" : " +this.harga + "$");
    }

    public void beliSecond(){
        int selisihTahun = 2024 - this.tahunProduksi;
        if (selisihTahun ==0){
            System.out.println(this.jenis +" masih dalam keadaan baru dapat dibeli dengan harga " +this.harga +"$");
            return;
        }
        System.out.println("Harga awal " +this.jenis +" : "+this.harga +"$");
        harga -= harga * 0.1 + harga* 0.05*(selisihTahun-1);
        System.out.println(this.jenis +" second dapat dibeli dengan harga " +this.harga +"$");
    }
}
