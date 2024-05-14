public class Mobil extends Kendaraan{
    tipeMobil tipemobil;

    enum tipeMobil{
        suv(2000,1000,850), Sedan(1850,770,800), Double_Cabin(4000,3000,2850),
        Crossover(3000,2000,1490), Hatchback(4000,2000,3000);
        final int mesin;
        final int interior;
        final int eksterior;
        tipeMobil(int mesin, int interior, int eksterior) {
            this.mesin = mesin;
            this.interior = interior;
            this.eksterior = eksterior;
        }
    }

    public Mobil(String merek, int tahunProduksi, int harga, tipeMobil tipemobil) {
        super(merek, tahunProduksi,harga);
        this.tipemobil = tipemobil;
        this.jenis = "mobil";
    }

    public int biayaKerusakan(){
        int biaya;
        switch (this.kerusakan){
            case ("Interior"):{
                biaya = this.tipemobil.interior;
                break;
            }
            case ("Eksterior"):{
                biaya = this.tipemobil.eksterior;
                break;
            }
            case ("Mesin"):{
                biaya = this.tipemobil.mesin;
                break;
            }
            case null, default:
                System.out.println("Maaf tidak terdapat kerusakan dalam kendaraan anda");
                return 0;
        }
        System.out.println("Terdapat kerusakan pada " + this.kerusakan);
        System.out.println("Biaya pelayanan yang perlu dibayar sebanyak " + biaya +"$");
        return biaya;
    }
    public void info_spesifikasi() {
        super.info_spesifikasi();
        System.out.println("Tipe  " + this.jenis +" : " +this.tipemobil );
    }
}
