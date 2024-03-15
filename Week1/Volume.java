package Week1;
// Untuk Mengatur Angka Desimal Setelah Koma
import java.text.DecimalFormat;
public class Volume {
    public static void main(String[] args) {
        System.out.println("Volume Tabung");
        System.out.println("Rumus : phl x (r x r) x t");

        float phl = 3.14f;
        System.out.println("phl = 3.14");

        System.out.println("diameter = 5");
        float diameter = 5;
        float r = diameter/2;
        System.out.print("r = ");
        System.out.println(r);

        int tinggi = 10;
        System.out.println("tinggi = 10");

        float hasil = phl*(r*r)*tinggi;

        // Angka Desimal Setelah Koma Hanya Muncul 2 Angka
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("hasil = ");
        System.out.print(df.format(hasil));
    }
}
