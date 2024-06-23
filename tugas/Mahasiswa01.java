package tugas;

public class Mahasiswa01 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa01() {
    }

    public Mahasiswa01(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return String.format("NIM: %-10s Nama: %-20s Telp: %-10s", nim, nama, notelp);
    }
}
