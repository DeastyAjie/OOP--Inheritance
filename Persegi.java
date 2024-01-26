package inheritance;

public class Persegi extends BangunDatar {

    double sisi; //sifat yang ditaruh di class anak ini, cuma yang beda atau yang gak dipunya class lai

    double luas() {
        double luas = sisi * sisi;
        System.out.println("Menghitung luas persegi : " + luas);
        return 0; //diisi rumus
    }

    double keliling() {
        double keliling = 4 * sisi;
        System.out.println("Menghitung keliling persegi : " + keliling);
        return 0; //diisi rumus
    }
}
