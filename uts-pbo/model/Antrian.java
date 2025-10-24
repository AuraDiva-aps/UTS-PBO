package model;
import java.util.*;

public class Antrian {
    private List<Pasien> daftarPasien = new ArrayList<>();

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public Pasien panggilPasien() {
        if (!daftarPasien.isEmpty()) {
            return daftarPasien.remove(0);
        }
        return null;
    }

    public void hapusPasien(String nomorAntrian) {
        daftarPasien.removeIf(p -> p.getNomorAntrian().equals(nomorAntrian));
    }

    public void tampilkanAntrian() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Tidak ada pasien dalam antrian.");
        } else {
            daftarPasien.forEach(System.out::println);
        }
    }

    public int getJumlahPasien() {
        return daftarPasien.size();
    }
}
