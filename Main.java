package inheritance;

public class Main {
    public static void main(String[] args) {
        
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi (); //Persegi yang depan = class
        persegi.sisi = 2; // di kasih nilai 2
        
        // membuat objek Lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran ();
        lingkaran.r = 22;
        
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
