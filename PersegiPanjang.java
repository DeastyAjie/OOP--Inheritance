package inheritance;

public class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;

    double luas() {
        double luas = 2 * (panjang + lebar);
        System.out.println("Menghitung luas Persegi Panjang : " +luas);
        return 0; //diisi rumus
    }

    double keliling() {
        double keliling = panjang * lebar;
        System.out.println("Menghitung keliling Persegi Panjang : " + keliling);
        return 0; //diisi rumus
    }

}
