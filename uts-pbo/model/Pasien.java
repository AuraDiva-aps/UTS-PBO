package model;

public class Pasien {
    private String nama;
    private String idPasien;
    private String jenisLayanan;
    private String nomorAntrian;

    public Pasien(String nama, String idPasien, String jenisLayanan, String nomorAntrian) {
        this.nama = nama;
        this.idPasien = idPasien;
        this.jenisLayanan = jenisLayanan;
        this.nomorAntrian = nomorAntrian;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNomorAntrian() { return nomorAntrian; }
    public void setNomorAntrian(String nomorAntrian) { this.nomorAntrian = nomorAntrian; }

    @Override
    public String toString() {
        return nomorAntrian + " - " + nama + " (" + jenisLayanan + ")";
    }
}
