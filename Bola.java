package BelajarJava.Enkapsulasi;

public class Bola {
        private double jariJari;

        public Bola() {
            this.jariJari = 14.0;
        }
        // mengatur nilai jari-jari
        public void setJariJari(double jariJari) {
            if (jariJari > 0) {
                this.jariJari = jariJari;
            } else {
                System.out.println("Jari-jari harus lebih dari 0.");
            }
        }
        // menampilkan nilai diameter bola
        public double showDiameter() {
            return 2 * jariJari;
        }
        // menampilkan nilai luas permukaan bola
        public double showLuasPermukaan() {
            return 4 * Math.PI * Math.pow(jariJari, 2);
        }
        // menampilkan nilai volume bola
        public double showVolume() {
            return (4/3) * Math.PI * Math.pow(jariJari, 3);
        }
    
    //     public static void main(String[] args) {
    //         // 1: Membuat variable Jarijari
    //         double jariJariVariable = 5.0;
    
    //         // 2: Menciptakan objek Bola
    //         Bola bolaObjek = new Bola();
    
    //         // 3: Memanggil method showDiameter(), showLuasPermukaan(), dan showVolume()
    //         System.out.println("Diameter: " + bolaObjek.showDiameter());
    //         System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
    //         System.out.println("Volume: " + bolaObjek.showVolume());
    
    //         // 4: Memanipulasi objek dengan memanggil method setJariJari()
    //         bolaObjek.setJariJari(jariJariVariable);
    
    //         // 5: Menampilkan hasil setelah manipulasi
    //         System.out.println("\nSetelah manipulasi:");
    //         System.out.println("Diameter: " + bolaObjek.showDiameter());
    //         System.out.println("Luas Permukaan: " + bolaObjek.showLuasPermukaan());
    //         System.out.println("Volume: " + bolaObjek.showVolume());    
    // }
}
