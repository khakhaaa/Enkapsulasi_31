package BelajarJava.Enkapsulasi;

public class TestBusPraktikum {
    public static void main(String[] args) {
        BusPraktikum busMini = new BusPraktikum(10);
        busMini.addPenumpang(11);
        busMini.addPenumpang(2);
        busMini.getPenumpang(10);
        busMini.getPenumpang(20);
        busMini.cetak();

        busMini.getAverage();
        busMini.cetak();
    }
}
