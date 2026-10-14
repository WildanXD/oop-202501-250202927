// HelloProcedural.java
public class HelloProcedural {
    public static void main(String[] args) {
        String nim = "293889401";
        String nama = "Wildan";
        String[] produk = {"Prosessor", "Heatsink", "Casing"};
        int[] harga = {6000000, 2500000, 1200000};
        int total = 0;
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + nama);
        System.out.println("Daftar Produk:");
        for (int i = 0; i < produk.length; i++) {
            System.out.println("- " + produk[i] + ": " + harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga semua produk: " + total);
    }
}