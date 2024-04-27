import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Buku extends Kategori{
    private int ISBN_Buku;
    private int IDAuthor;
    private int IDKondisiBarang;
    private int IDPenerbit;
    private String Judul;
    private String EdisiTerbitan;
    private int TahunTerbit;
    private Cover sampulcover;
    private int bukupinjam;
    private int bukutersedia;
    private int totalbuku;
    
    public enum Cover{
        HardCover, SoftCover
    }

    public Buku() {
        // Empty constructor
    }

    public Buku(int ISBN_Buku, int IDAuthor, int IDKondisiBarang, int IDPenerbit, String Judul, String EdisiTerbitan, int TahunTerbit, Cover sampulcover, int bukupinjam, int bukutersedia, int totalbuku) {
        this.ISBN_Buku = ISBN_Buku;
        this.IDAuthor = IDAuthor;
        this.IDKondisiBarang = IDKondisiBarang;
        this.IDPenerbit = IDPenerbit;
        this.Judul = Judul;
        this.EdisiTerbitan = EdisiTerbitan;
        this.TahunTerbit = TahunTerbit;
        this.sampulcover = sampulcover;
        this.bukupinjam = bukupinjam;
        this.bukutersedia = bukutersedia;
        this.totalbuku = totalbuku;
    }

    // Getter and Setter methods for all fields
    public int getISBN_Buku() {
        return ISBN_Buku;
    }

    public void setISBN_Buku(int ISBN_Buku) {
        this.ISBN_Buku = ISBN_Buku;
    }

    public int getIDAuthor() {
        return IDAuthor;
    }

    public void setIDAuthor(int IDAuthor) {
        this.IDAuthor = IDAuthor;
    }

    public int getIDKondisiBarang() {
        return IDKondisiBarang;
    }

    public void setIDKondisiBarang(int IDKondisiBarang) {
        this.IDKondisiBarang = IDKondisiBarang;
    }

    public int getIDPenerbit() {
        return IDPenerbit;
    }

    public void setIDPenerbit(int IDPenerbit) {
        this.IDPenerbit = IDPenerbit;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getEdisiTerbitan() {
        return EdisiTerbitan;
    }

    public void setEdisiTerbitan(String EdisiTerbitan) {
        this.EdisiTerbitan = EdisiTerbitan;
    }

    public int getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(int TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }

    public Cover getSampulcover() {
        return sampulcover;
    }

    public void setSampulcover(Cover sampulcover) {
        this.sampulcover = sampulcover;
    }

    public int getBukupinjam() {
        return bukupinjam;
    }

    public void setBukupinjam(int bukupinjam) {
        this.bukupinjam = bukupinjam;
    }

    public int getBukutersedia() {
        return bukutersedia;
    }

    public void setBukutersedia(int bukutersedia) {
        this.bukutersedia = bukutersedia;
    }

    public int getTotalbuku() {
        return totalbuku;
    }

    public void setTotalbuku(int totalbuku) {
        this.totalbuku = totalbuku;
    }

    public static void main(String[] args) {
        // Membuat daftar contoh buku
        List<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(new Buku(1234567890, 1, 1, 1, "Java Programming", "Edisi Pertama", 2022, Buku.Cover.HardCover, 10, 5, 15));
        daftarBuku.add(new Buku(96543210, 2, 2, 2, "Data Structures and Algorithms", "Edisi Kedua", 2020, Buku.Cover.SoftCover, 8, 3, 11));
        daftarBuku.add(new Buku(5453555, 3, 1, 3, "Introduction to PHP", "Edisi Ketiga", 2021, Buku.Cover.SoftCover, 12, 7, 19));

        // Menyimpan data buku ke dalam file teks (Output.txt)
        String namaFile = "Output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            // Menulis header tabel
            writer.write(String.format("%-10s | %-30s | %-20s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s%n",
                    "ISBN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Buku", "ID Author", "ID Penerbit"));
            writer.write("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Menulis data buku ke dalam tabel
            for (Buku buku : daftarBuku) {
                writer.write(String.format("%-10d | %-30s | %-20s | %-10d | %-10s | %-15d | %-15d | %-10d | %-10d | %-10d%n",
                        buku.getISBN_Buku(),
                        buku.getJudul(),
                        buku.getEdisiTerbitan(),
                        buku.getTahunTerbit(),
                        buku.getSampulcover().toString(),
                        buku.getBukupinjam(),
                        buku.getBukutersedia(),
                        buku.getTotalbuku(),
                        buku.getIDAuthor(),
                        buku.getIDPenerbit()));
            }

            System.out.println("Data telah disimpan ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }
}
    
        