package inheritance;

public class Segitiga extends BangunDatar {

    double alas;
    double tinggi;
    double sisi;
    

    double luas() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Menghitung luas segitiga : " + luas);
        return 0; //diisi rumus
    }

    double keliling() {
        double keliling = sisi * sisi * sisi;
        System.out.println("Menghitung keliling segitiga : " + keliling);
        return 0; //diisi rumus
    }
}
