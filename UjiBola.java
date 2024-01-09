package BelajarJava.Enkapsulasi;

public class UjiBola {
    public static void main(String[] args) {
        // 1: Membuat variable Jarijari
        double jariJariVariable = 10.0;

        // 2: Menciptakan objek Bola
        Bola bolaObjek = new Bola();

        // 3: Memanggil method showDiameter(), showLuasPermukaan(), dan showVolume()
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());

        // 4: Memanipulasi objek dengan memanggil method setJariJari()
        bolaObjek.setJariJari(jariJariVariable);

        // 5: Menampilkan hasil setelah manipulasi
        System.out.println("\nSetelah manipulasi:");
        System.out.println("Diameter: " + bolaObjek.showDiameter());
        System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
        System.out.println("Volume: " + bolaObjek.showVolume());    
    }
}
