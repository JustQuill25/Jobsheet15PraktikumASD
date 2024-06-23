package tugas;

public class MataKuliah01 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah01(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public static String getNamaMKByKode(String kodeMK) {
        switch (kodeMK) {
            case "00001":
                return "Internet of Things";
            case "00002":
                return "Algoritma dan Struktur Data";
            case "00003":
                return "Algoritma dan Pemrograman";
            case "00004":
                return "Praktikum Algoritma dan Struktur Data";
            case "00005":
                return "Praktikum Algoritma dan Pemrograman";
            default:
                return "Mata kuliah tidak ditemukan";
        }
    }

    public static int getSksByKodeMK(String kodeMK) {
        switch (kodeMK) {
            case "00001":
                return 3;
            case "00002":
            case "00003":
                return 2;
            case "00004":
            case "00005":
                return 3;
            default:
                return 0;
        }
    }
}
