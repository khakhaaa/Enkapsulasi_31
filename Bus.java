package BelajarJava.Enkapsulasi;

public class Bus {
    private int penumpang, maxPenumpang;
    private double counter, penumpangBaru, totalBerat;

    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }

    public void plusPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp>maxPenumpang){
            System.out.println("Overload penumpang");
        }
        else{
            this.penumpang=temp;
        }
    }

    public void getPassword(int password){
        if (password==90) {
            System.out.println("pass benar");
        } else {
            System.out.println("pass salah");
        }
    }

    public void getAverage(){
        if (penumpang == 0) {
            System.out.println("Tidak ada penumpang");
        } else {
            double average = totalBerat/penumpang;
            System.out.println("Rata-rata berat penumpang adalah = "+average);
        }
    }

        public void cetak(){
            System.out.println("Penumpang sekarang = "+penumpang);
            System.out.println("Penumpang seharusnya adalah = "+maxPenumpang);
    }
}