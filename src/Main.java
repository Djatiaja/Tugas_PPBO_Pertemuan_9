//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Mobil kendaraan = new Mobil("Daihatsu", 2020 ,20000, Mobil.tipeMobil.suv);
        kendaraan.setRandomKerusakan();
        kendaraan.biayaKerusakan();
        kendaraan.info_spesifikasi();
        SepedaMotor motor = new SepedaMotor("Honda", 2023, 2000, SepedaMotor.JenisMesin.mesin125cc);
        motor.info_spesifikasi();
        motor.beliSecond();
    }
}