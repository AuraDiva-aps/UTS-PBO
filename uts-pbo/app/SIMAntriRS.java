package app;
import model.*;
import java.util.Scanner;

public class SIMAntriRS {
    private Antrian antrian = new Antrian();
    private Laporan laporan = new Laporan();
    private Scanner input = new Scanner(System.in);

    public void tampilkanMenu() {
        System.out.println("\n=== SISTEM ANTRIAN RUMAH SAKIT ===");
        System.out.println("1. Registrasi Pasien");
        System.out.println("2. Panggil Pasien");
        System.out.println("3. Lihat Daftar Antrian");
        System.out.println("4. Hapus Pasien");
        System.out.println("5. Laporan Harian");
        System.out.println("6. Keluar");
        System.out.print("Pilih menu: ");
    }

    public void pilihMenu(int pilihan) {
        switch (pilihan) {
            case 1 -> registrasiPasien();
            case 2 -> panggilPasien();
            case 3 -> antrian.tampilkanAntrian();
            case 4 -> hapusPasien();
            case 5 -> laporan.tampilkanLaporan();
            case 6 -> System.out.println("Terima kasih, program selesai.");
            default -> System.out.println("Pilihan tidak valid!");
        }
    }

    private void registrasiPasien() {
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("ID Pasien: ");
        String id = input.nextLine();
        System.out.print("Jenis Layanan: ");
        String layanan = input.nextLine();
        String nomor = "A" + (antrian.getJumlahPasien() + 1);
        Pasien pasien = new PasienNormal(nama, id, layanan, nomor);
        antrian.tambahPasien(pasien);
        laporan.tambahTerdaftar();
        System.out.println("Pasien berhasil didaftarkan dengan nomor antrian " + nomor);
    }

    private void panggilPasien() {
        Pasien p = antrian.panggilPasien();
        if (p != null) {
            System.out.println("Memanggil pasien: " + p.getNama() + " (" + p.getNomorAntrian() + ")");
            laporan.tambahDilayani();
        } else {
            System.out.println("Tidak ada pasien dalam antrian.");
        }
    }

    private void hapusPasien() {
        System.out.print("Masukkan nomor antrian yang ingin dihapus: ");
        String nomor = input.nextLine();
        antrian.hapusPasien(nomor);
        laporan.tambahBatal();
        System.out.println("Data pasien berhasil dihapus.");
    }

    public void jalankanProgram() {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = Integer.parseInt(input.nextLine());
            pilihMenu(pilihan);
        } while (pilihan != 6);
    }
}
