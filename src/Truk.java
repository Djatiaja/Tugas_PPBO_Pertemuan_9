public class Truk extends Kendaraan{
    Kapasitas kapasitasAngkut;

    enum Kapasitas{
        kapasitasMaks8_5ton(10000,2000,3000, 8.5),kapasitasMaks16ton(150000,3000,3000, 16)
        ,kapasitasMaks20ton(20000,5000,4000, 20);
        final int mesin;
        final int interior;
        final int eksterior;
        final double kapasitas;
        Kapasitas(int mesin, int interior, int eksterior, double kapasitas) {
            this.mesin = mesin;
            this.interior = interior;
            this.eksterior = eksterior;
            this.kapasitas= kapasitas;
        }
    }

    public Truk(String merek, int tahunProduksi, int harga, Kapasitas kapasitasAngkut) {
        super(merek, tahunProduksi, harga);
        this.kapasitasAngkut = kapasitasAngkut;
        this.jenis = "truck";

    }
    public int biayaKerusakan(){
        int biaya;
        switch (this.kerusakan){
            case ("Interior"):{
                biaya = this.kapasitasAngkut.interior;
                break;
            }
            case ("Eksterior"):{
                biaya = this.kapasitasAngkut.eksterior;
                break;
            }
            case ("Mesin"):{
                biaya = this.kapasitasAngkut.mesin;
                break;
            }
            case null, default:
                System.out.println("Maaf tidak terdapat kerusakan dalam kendaraan anda");
                return 0;
        }
        System.out.println("Terdapat kerusakan pada " + this.kerusakan );
        System.out.println("Biaya pelayanan yang perlu dibayar sebanyak " + biaya +"$");
        return biaya;
    }

    @Override
    public void info_spesifikasi() {
        super.info_spesifikasi();
        System.out.println("Kapasitas angkut maksimal : " +this.kapasitasAngkut.kapasitas +" ton");
    }
}
