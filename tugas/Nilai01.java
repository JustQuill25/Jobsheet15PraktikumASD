package tugas;

public class Nilai01 {
    String nim;
    String kodeMK;
    double nilai;

    public Nilai01(String nim, String kodeMK, double nilai) {
        this.nim = nim;
        this.kodeMK = kodeMK;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-40s%-5d%.2f", nim, ListMahasiswa01.getNamaByNim(nim), MataKuliah01.getNamaMKByKode(kodeMK), MataKuliah01.getSksByKodeMK(kodeMK), nilai);
    }
}
