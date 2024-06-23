package tugas;

import java.util.Scanner;

public class MainProgram {
    static Scanner scanner = new Scanner(System.in);
    static ListMahasiswa01 lm = new ListMahasiswa01();

    public static void main(String[] args) {
        int pilihan;

        Mahasiswa01 m1 = new Mahasiswa01("20001", "Thalhah", "021123");
        Mahasiswa01 m2 = new Mahasiswa01("20002", "Zubair", "021124");
        Mahasiswa01 m3 = new Mahasiswa01("20003", "AbdurRahman", "021125");
        Mahasiswa01 m4 = new Mahasiswa01("20004", "Sa'ad", "021126");
        Mahasiswa01 m5 = new Mahasiswa01("20005", "Sa'id", "021127");
        Mahasiswa01 m6 = new Mahasiswa01("20006", "Ubaidah", "021128");

        ListMahasiswa01.tambahMahasiswa(m1);
        ListMahasiswa01.tambahMahasiswa(m2);
        ListMahasiswa01.tambahMahasiswa(m3);
        ListMahasiswa01.tambahMahasiswa(m4);
        ListMahasiswa01.tambahMahasiswa(m5);
        ListMahasiswa01.tambahMahasiswa(m6);

        MataKuliah01 mk1 = new MataKuliah01("00001", "Internet of Things", 3);
        MataKuliah01 mk2 = new MataKuliah01("00002", "Algoritma dan Struktur Data", 2);
        MataKuliah01 mk3 = new MataKuliah01("00003", "Algoritma dan Pemrograman", 2);
        MataKuliah01 mk4 = new MataKuliah01("00004", "Praktikum Algoritma dan Struktur Data", 3);
        MataKuliah01 mk5 = new MataKuliah01("00005", "Praktikum Algoritma dan Pemrograman", 3);

        System.out.println("\n============================================");
        System.out.println("SISTEM PENGOLAHAN NILAI MAHASISWA PUNYA BIMA");
        System.out.println("============================================");

        do {
            tampilkanMenu();
            System.out.print("Pilih\t: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (pilihan) {
                case 1:
                    lm.inputNilai();
                    break;
                case 2:
                    lm.tampilNilaiMahasiswa();
                    break;
                case 3:
                    lm.cariNilaiMahasiswa();
                    break;
                case 4:
                    // Implementasi urut data nilai jika diperlukan
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void tampilkanMenu() {
        System.out.println("\n============================================");
        System.out.println("1. Input Nilai");
        System.out.println("2. Tampil Nilai");
        System.out.println("3. Mencari Nilai Mahasiswa");
        System.out.println("4. Urut Data Nilai");
        System.out.println("5. Keluar");
        System.out.println("============================================");
    }
}
