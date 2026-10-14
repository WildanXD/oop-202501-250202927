// HelloOOP.java
class Produk {
    String nama;
    int harga;
    Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        String nim = "112231241";
        String namaMhs = "Wildan";
        Produk[] daftar = {
                new Produk("RAM", 2000000),
                new Produk("SSD", 1500000),
                new Produk("MOBO", 1200000)
        };
        int total = 0;
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
        System.out.println("Daftar Produk:");
        for (Produk p : daftar) {
            System.out.println("- " + p.nama + ": " + p.harga);
            total += p.harga;
        }
        System.out.println("Total harga semua produk: " + total);
    }
}