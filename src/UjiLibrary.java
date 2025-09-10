import id.ac.polban.model.Karyawan;
import id.ac.polban.service.Kantor;
import java.util.Scanner;

public class UjiLibrary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pilihanMenu = 0;

        System.out.println("=== APLIKASI KLIEN UNTUK LIBRARY KANTOR ===");

        while (pilihanMenu != 4) {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Karyawan");
            System.out.println("2. Tampilkan Semua Karyawan");
            System.out.println("3. Hapus Karyawan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihanMenu = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            // Switch case untuk memproses pilihan menu
            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan ID Karyawan   : ");
                    String id = scanner.nextLine();
                    System.out.print("Masukkan Nama Karyawan : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Jabatan       : ");
                    String jabatan = scanner.nextLine();
                    System.out.print("Masukkan Divisi        : ");
                    String divisi = scanner.nextLine();

                    // Buat objek karayawanBaru
                    Karyawan karyawanBaru = new Karyawan(id, nama, jabatan, divisi);
                    Kantor.tambahKaryawan(karyawanBaru);
                    break;
                case 2:
                    Kantor.tampilkanSemuaKaryawan();
                    break;
                case 3:
                    System.out.print("Masukkan ID Karyawan yang akan dihapus: ");
                    String idUntukDihapus = scanner.nextLine();
                    Kantor.hapusKaryawan(idUntukDihapus);
                    break;
                case 4:
                    System.out.println("Terima kasih, aplikasi klien ditutup.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}