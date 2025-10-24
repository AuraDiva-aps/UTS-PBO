package model;

public class PasienDarurat extends Pasien {
    private int prioritas;

    public PasienDarurat(String nama, String idPasien, String jenisLayanan, String nomorAntrian, int prioritas) {
        super(nama, idPasien, jenisLayanan, nomorAntrian);
        this.prioritas = prioritas;
    }

    public int getPrioritas() { return prioritas; }
}
