package inheritance;

public class Lingkaran extends BangunDatar {

    // jari-jari lingkaran
    double r;

    double luas() {
        double luas = Math.PI * r *r;
        System.out.println("Menghitung luas lingkaran : " + luas);
        return 0; //diisi rumus
    }

    double keliling() {
        double keliling = 2 * Math.PI * r;
        System.out.println("Menghitung keliling lingkaran : " + keliling);
        return 0; //diisi rumus
    }
}
