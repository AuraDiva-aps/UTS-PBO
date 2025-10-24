package model;

import java.util.ArrayList;
import java.util.List;

public class Laporan {
    private List<Antrian> daftarAntrian = new ArrayList<>();
    private int totalTerdaftar;
    private int totalDilayani;
    private int totalBatal;

    public void tambahTerdaftar() { totalTerdaftar++; }
    public void tambahDilayani() { totalDilayani++; }
    public void tambahBatal() { totalBatal++; }

    public void tampilkanLaporan() {
        System.out.println("=== LAPORAN HARIAN ===");
        System.out.println("Total Terdaftar : " + totalTerdaftar);
        System.out.println("Total Dilayani  : " + totalDilayani);
        System.out.println("Total Batal     : " + totalBatal);
    }
}
