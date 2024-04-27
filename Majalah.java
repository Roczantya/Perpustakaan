import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Majalah extends Kategori{
        private int ISBN_Majalah;
        private int IDAuthor;
        private int IDKondisiBarang;
        private int IDPenerbit;
        private String Judul;
        private String EdisiTerbitan;
        private int TahunTerbit;
        private Cover sampulcover;
        private int  Majalahpinjam;
        private int Majalahtersedia;
        private int totalMajalah;
        
        
        public enum Cover{
            HardCover, SoftCover
        }
    
        public Majalah() {
            // Empty constructor
        }
    public Majalah(int ISBN_Majalah, int IDAuthor, int IDKondisiBarang, int IDPenerbit, String Judul, String EdisiTerbitan, int TahunTerbit, Cover sampulcover, int Majalahpinjam, int Majalahtersedia, int totalMajalah) {
        this.ISBN_Majalah = ISBN_Majalah;
        this.IDAuthor = IDAuthor;
        this.IDKondisiBarang = IDKondisiBarang;
        this.IDPenerbit = IDPenerbit;
        this.Judul = Judul;
        this.EdisiTerbitan = EdisiTerbitan;
        this.TahunTerbit = TahunTerbit;
        this.sampulcover = sampulcover;
        this.Majalahpinjam = Majalahpinjam;
        this.Majalahtersedia = Majalahtersedia;
        this.totalMajalah = totalMajalah;
    }

    public int getISBN_Majalah() {
        return ISBN_Majalah;
    }

    public void setISBN_Majalah(int ISBN_Majalah) {
        this.ISBN_Majalah = ISBN_Majalah;
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

    public int getMajalahpinjam() {
        return Majalahpinjam;
    }

    public void setMajalahpinjam(int Majalahpinjam) {
        this.Majalahpinjam = Majalahpinjam;
    }

    public int getMajalahtersedia() {
        return Majalahtersedia;
    }

    public void setMajalahtersedia(int Majalahtersedia) {
        this.Majalahtersedia = Majalahtersedia;
    }

    public int getTotalMajalah() {
        return totalMajalah;
    }

    public void setTotalMajalah(int totalMajalah) {
        this.totalMajalah = totalMajalah;
    }

    public static void main(String[] args) {
     List<Majalah> daftarMajalah = createSampleMagazineList();

        // Specify the output file name
        String namaFile = "Output_Majalah.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            // Write header for the table
            writer.write(String.format("%-10s | %-30s | %-20s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s s%n",
                    "ISBN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Majalah", "ID Author", "ID Penerbit"));
            writer.write("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Write data for each magazine to the table
            for (Majalah majalah : daftarMajalah) {
                writer.write(String.format("%-10d | %-30s | %-20s | %-10d | %-10s | %-15d | %-15d | %-13s | %-10d | %-10d%n",
                        majalah.getISBN_Majalah(),
                        majalah.getJudul(),
                        majalah.getEdisiTerbitan(),
                        majalah.getTahunTerbit(),
                        majalah.getSampulcover().toString(),
                        majalah.getMajalahpinjam(),
                        majalah.getMajalahtersedia(),
                        majalah.getTotalMajalah(),
                        majalah.getIDAuthor(),
                        majalah.getIDPenerbit()));
            }

            System.out.println("Data for magazines has been saved to " + namaFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    // Method to create a list of sample magazines
    private static List<Majalah> createSampleMagazineList() {
        List<Majalah> daftarMajalah = new ArrayList<>();

        // Add some sample magazines to the list
        daftarMajalah.add(new Majalah(1234567890, 1, 1, 1, "Technology Today", "Volume 1", 2022, Majalah.Cover.HardCover, 10, 5, 15));
        daftarMajalah.add(new Majalah(98765210, 2, 2, 2, "Science News", "Issue 3", 2021, Majalah.Cover.SoftCover, 8, 3, 11));
        daftarMajalah.add(new Majalah(5553495, 3, 1, 3, "Travel Adventure", "Summer Edition", 2022, Majalah.Cover.SoftCover, 12, 7, 19));

        return daftarMajalah;
    }

    }
    
    

