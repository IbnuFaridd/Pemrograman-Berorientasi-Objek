package Week1;

import java.text.DecimalFormat;

public class Keliling {
    public static void main(String[] args) {
        System.out.println("Keliling Lingkaran");
        System.out.println("Rumus : phl x diameter");
        System.out.println("phl = 3.14");
        System.out.println("diameter = 10");
        float phl = 3.14f;
        int diameter = 10;
        float hasil = phl * diameter;
        //Angka Desimal Setelah Koma Hanya Muncul Dua Angka
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("hasil = ");
        System.err.print(df.format(hasil));

    }
}
