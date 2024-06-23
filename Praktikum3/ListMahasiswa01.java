package Praktikum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa01 {
    List<Mahasiswa01> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa01... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa01 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public int binarySearch(String nim) {
        // Modifikasi: Pastikan list diurutkan berdasarkan nim sebelum menggunakan binarySearch
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        
        // Modifikasi: Lakukan binary search
        Mahasiswa01 key = new Mahasiswa01(nim, "", "");
        int index = Collections.binarySearch(mahasiswas, key, Comparator.comparing(m -> m.nim));
        
        return index;
    }

    // Menambahkan fungsi sorting ascending
    public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    // Menambahkan fungsi sorting descending
    public void sortDescending() {
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa01 lm = new ListMahasiswa01();
        Mahasiswa01 m1 = new Mahasiswa01("201234", "Noureen", "021xx1");
        Mahasiswa01 m2 = new Mahasiswa01("201235", "Akhleema", "021xx2");
        Mahasiswa01 m3 = new Mahasiswa01("201236", "Shannum", "021xx3");

        lm.tambah(m1, m2, m3);

        System.out.println("Setelah penambahan:");
        lm.tampil();

        // Menggunakan binarySearch untuk mencari mahasiswa berdasarkan nim
        int index = lm.binarySearch("201235");
        if (index >= 0) {
            System.out.println("\nMahasiswa ditemukan pada indeks: " + index);
            System.out.println("Detail mahasiswa: " + lm.mahasiswas.get(index));
        } else {
            System.out.println("\nMahasiswa tidak ditemukan.");
        }

        // Mengurutkan secara ascending
        System.out.println("\nSorting ascending:");
        lm.sortAscending();
        lm.tampil();

        // Mengurutkan secara descending
        System.out.println("\nSorting descending:");
        lm.sortDescending();
        lm.tampil();
    }
}
