package tugas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMahasiswa01 {
    static List<Mahasiswa01> mahasiswas = new ArrayList<>();
    static List<Nilai01> daftarNilai = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void inputNilai() {
        System.out.println("\nMasukkan data nilai mahasiswa");
        System.out.print("NIM\t: ");
        String nim = scanner.nextLine();
        System.out.print("Kode\t: ");
        String kodeMK = scanner.nextLine();
        System.out.print("Nilai\t: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        daftarNilai.add(new Nilai01(nim, kodeMK, nilai));
    }

    public void tampilNilaiMahasiswa() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("======================================================================================");
        System.out.printf("%-10s%-25s%-40s%-5s%s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("--------------------------------------------------------------------------------------");

        for (Nilai01 nilai : daftarNilai) {
            System.out.println(nilai.toString());
        }

        System.out.println("======================================================================================");
    }

    public void cariNilaiMahasiswa() {
        System.out.println("\nMasukkan data mahasiswa[nim]");
        System.out.print("NIM\t: ");
        String nim = scanner.nextLine();

        System.out.printf("\nDAFTAR NILAI MAHASISWA UNTUK NIM %s\n", nim);
        System.out.println("======================================================================================");
        System.out.printf("%-10s%-25s%-40s%-5s%s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        System.out.println("--------------------------------------------------------------------------------------");

        double totalSKS = 0;
        boolean found = false;

        for (Nilai01 nilai : daftarNilai) {
            if (nilai.nim.equals(nim)) {
                System.out.println(nilai.toString());
                totalSKS += MataKuliah01.getSksByKodeMK(nilai.kodeMK);
                found = true;
            }
        }

        System.out.println("--------------------------------------------------------------------------------------");

        if (found) {
            System.out.printf("\nTotal SKS %s telah diambil: %.2f\n", nim, totalSKS);
        } else {
            System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
        }
    }

    public static String getNamaByNim(String nim) {
        for (Mahasiswa01 mhs : mahasiswas) {
            if (mhs.nim.equals(nim)) {
                return mhs.nama;
            }
        }
        return "Nama tidak ditemukan";
    }

    public static void tambahMahasiswa(Mahasiswa01 mhs) {
        mahasiswas.add(mhs);
    }

    public static void tambahNilai(Nilai01 nilai) {
        daftarNilai.add(nilai);
    }

    public static List<Mahasiswa01> getMahasiswas() {
        return mahasiswas;
    }

    public static List<Nilai01> getDaftarNilai() {
        return daftarNilai;
    }
}
