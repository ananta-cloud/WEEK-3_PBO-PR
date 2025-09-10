package id.ac.polban.service;

import id.ac.polban.model.Karyawan;
import java.util.ArrayList;
import java.util.List;

public class Kantor {
    private static List<Karyawan> daftarKaryawan = new ArrayList<>();

    public static void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
        System.out.println("-> Berhasil menambahkan karyawan: " + Karyawan.getNama());
    }

    public static void tampilkanSemuaKaryawan() {
        System.out.println("\n--- Daftar Karyawan ---");
        if (daftarKaryawan.isEmpty()) {
            System.out.println("Belum ada data karyawan.");
        } else {
            // Menggunakan for-each loop lebih ringkas dan aman daripada Iterator manual
            for (Karyawan karyawan : daftarKaryawan) {
                System.out.println(karyawan); // Memanggil method toString() secara implisit
            }
        }
        System.out.println("-----------------------");
    }

    public static void hapusKaryawan(String id) {
        boolean isRemoved = daftarKaryawan.removeIf(karyawan -> Karyawan.getId().equalsIgnoreCase(id));
        if (isRemoved) {
            System.out.println("-> Karyawan dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("-> Karyawan dengan ID " + id + " tidak ditemukan.");
        }
    }
}