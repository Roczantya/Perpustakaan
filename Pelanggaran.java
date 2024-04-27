import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Pelanggaran {
    private String NamaPelanggaran;
    private int hargatelat;
    private int hargabasah;
    private int hargalecet;
    private int hargarobek;
    private int hargahilang;
    private int tidakadapelanggarran;

    public Pelanggaran() {
        // Empty constructor
    }

    public Pelanggaran(String NamaPelanggaran, int hargatelat, int hargabasah, int hargalecet, int hargarobek, int hargahilang, int tidakadapelanggarran) {
        this.NamaPelanggaran = NamaPelanggaran;
        this.hargatelat = hargatelat;
        this.hargabasah = hargabasah;
        this.hargalecet = hargalecet;
        this.hargarobek = hargarobek;
        this.hargahilang = hargahilang;
        this.tidakadapelanggarran = tidakadapelanggarran;
    }

    public String getNamaPelanggaran(){
        return NamaPelanggaran;
    }

    public void setNamaPelanggaran(String NamaPelanggaran){
        this.NamaPelanggaran = NamaPelanggaran;
    }
    public int getHargatelat() {
        return hargatelat;
    }

    public void setHargatelat(int hargatelat) {
        this.hargatelat = hargatelat;
    }

    public int getHargabasah() {
        return hargabasah;
    }

    public void setHargabasah(int hargabasah) {
        this.hargabasah = hargabasah;
    }

    public int getHargalecet() {
        return hargalecet;
    }

    public void setHargalecet(int hargalecet) {
        this.hargalecet = hargalecet;
    }

    public int getHargarobek() {
        return hargarobek;
    }

    public void setHargarobek(int hargarobek) {
        this.hargarobek = hargarobek;
    }

    public int getHargahilang() {
        return hargahilang;
    }

    public void setHargahilang(int hargahilang) {
        this.hargahilang = hargahilang;
    }
    
    public int getTidakadapelanggarran() {
        return tidakadapelanggarran;
    }

    public void setTidakadapelanggarran(int tidakadapelanggarran) {
        this.tidakadapelanggarran = tidakadapelanggarran;
    }
    
        public static void main(String[] args) {
            // Membuat ArrayList untuk menyimpan pelanggaran
            List<Pelanggaran> daftarPelanggaran = new ArrayList<>();
    
            // Menambahkan beberapa contoh pelanggaran ke dalam ArrayList
            daftarPelanggaran.add(new Pelanggaran("Denda hilang/1 buku", 0, 0, 0, 0, 100000, 0));
            daftarPelanggaran.add(new Pelanggaran("Denda telat", 5000, 0, 0, 0, 0, 0));
            daftarPelanggaran.add(new Pelanggaran("Denda lecet", 0, 0, 10000, 0, 0, 0));
            daftarPelanggaran.add(new Pelanggaran("Harga basah", 0, 100000, 0, 0, 0, 0));
            daftarPelanggaran.add(new Pelanggaran("Harga robek", 0, 0, 0, 20000, 0, 0));
            daftarPelanggaran.add(new Pelanggaran("Tidak ada pelanggaran", 0, 0, 0, 0, 0, 0));
    
            // Menyimpan data dari ArrayList ke dalam file teks (Output.txt)
            String namaFile = "Output1.txt";
    
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
                // Menulis header tabel
                writer.write(String.format("%-30s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                        "Nama Pelanggaran", "Telat", "Lecet", "Basah", "Hilang", "Robek", "Tidak Ada"));
    
                // Menulis data baris per baris
                for (Pelanggaran pelanggaran : daftarPelanggaran) {
                    writer.write(String.format("%-30s %-10d %-10d %-10d %-10d %-10d %-10d%n",
                            pelanggaran.getNamaPelanggaran(),
                            pelanggaran.getHargatelat(),
                            pelanggaran.getHargalecet(),
                            pelanggaran.getHargabasah(),
                            pelanggaran.getHargahilang(),
                            pelanggaran.getHargatelat(),
                            pelanggaran.getTidakadapelanggarran()));
                }
    
                System.out.println("Data telah disimpan ke " + namaFile);
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
            }
        }
    }

  