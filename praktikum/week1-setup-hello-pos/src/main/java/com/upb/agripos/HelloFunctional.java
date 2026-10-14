// HelloFunctional.java
import java.util.*;
import java.util.stream.*;
public class HelloFunctional {
    public static void main(String[] args) {
        String nim = "219374109";
        String nama = "Wildan";
        List<String> produk = Arrays.asList("Monitor", "Mouse", "Keyboard");
        List<Integer> harga = Arrays.asList(2500000, 150000, 500000);
        System.out.println("Hello POS World");
        System.out.println("NIM: " + nim + ", Nama: " + nama);
        System.out.println("Daftar Produk:");
        IntStream.range(0, produk.size())
                .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
        int total = harga.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total harga semua produk: " + total);
    }
}