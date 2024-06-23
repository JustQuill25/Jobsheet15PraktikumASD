package Praktikum3;

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
        return "Mahasiswa01{" +
                "nim='" + nim + '\'' +
                ", nama='" + nama + '\'' +
                ", notelp='" + notelp + '\'' +
                '}';
    }
}
