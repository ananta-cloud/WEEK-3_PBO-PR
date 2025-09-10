package id.ac.polban.model;

public class Karyawan {
   private static String id;
   private static String nama;
   private static String jabatan;
   private static String divisi;

   public Karyawan(String id, String nama, String jabatan, String divisi) {
      Karyawan.id = id;
      Karyawan.nama = nama;
      Karyawan.jabatan = jabatan;
      Karyawan.divisi = divisi;
   }

   public static String getId() {
      return Karyawan.id;
   }

   public static String getNama() {
      return Karyawan.nama;
   }

   public static String getJabatan() {
      return Karyawan.jabatan;
   }

   public static String getDivisi() {
      return Karyawan.divisi;
   }

   public static void setId(String id) {
      Karyawan.id = id;
   }

   public static void setNama(String nama) {
      Karyawan.nama = nama;
   }

   public static void setJabatan(String jabatan) {
      Karyawan.jabatan = jabatan;
   }

   public static void setDivisi(String divisi) {
      Karyawan.divisi = divisi;
   }

   public String toString() {
      return "  ID      : " + Karyawan.id + "\n  Nama    : " + Karyawan.nama + "\n  Jabatan : " + Karyawan.jabatan + "\n  Divisi  : " + Karyawan.divisi + "\n";
   }
}
