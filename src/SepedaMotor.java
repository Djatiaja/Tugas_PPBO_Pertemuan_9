import java.util.Random;

public class SepedaMotor extends Kendaraan{
    JenisMesin jenisMesin;
    enum JenisMesin{
        mesin110cc(230, 200,110), mesin125cc(240,200,125), mesin150cc(250,200,150),
        mesin250cc(300,280,250), mesin500cc(400,350,500), mesin1000cc(600,400,1000);
        final int mesin;
        final int eksterior;
        final int cc;
        JenisMesin(int mesin, int eksterior, int cc) {
            this.mesin = mesin;
            this.eksterior = eksterior;
            this.cc = cc;
        }
    }
    public SepedaMotor(String merek, int tahunProduksi, int harga, JenisMesin jenisMesin) {
        super(merek, tahunProduksi, harga);
        this.jenisMesin = jenisMesin;
        this.jenis ="motor";
    }

    @Override
    public void setRandomKerusakan() {
        Random random = new Random();
        String[] listKerusakan = {"Mesin", "Eksterior"};
        this.kerusakan = listKerusakan[random.nextInt(3)];
    }

    public int biayaKerusakan(){
        int biaya;
        switch (this.kerusakan){
            case ("Eksterior"):{
                biaya = this.jenisMesin.eksterior;
                break;
            }
            case ("Mesin"):{
                biaya = this.jenisMesin.mesin;
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

    @Override
    public void info_spesifikasi() {
        super.info_spesifikasi();
        System.out.println("Jenis mesin " + this.jenis +" : " +this.jenisMesin.cc +"cc");
    }
}
