//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mobil kendaraan = new Mobil("Daihatsu", 2020 ,20000, Mobil.tipeMobil.suv);
        kendaraan.info_spesifikasi();
        System.out.println();

        Truk truk = new Truk("Hino", 2024, 100000, Truk.Kapasitas.kapasitasMaks20ton);
        truk.info_spesifikasi();
        System.out.println();

        truk.beliSecond();
        System.out.println();

        truk.setRandomKerusakan();
        truk.biayaKerusakan();
        System.out.println();

        SepedaMotor motor = new SepedaMotor("Honda", 2023, 2000, SepedaMotor.JenisMesin.mesin125cc);
        motor.info_spesifikasi();
        System.out.println();
        motor.beliSecond();
    }
}