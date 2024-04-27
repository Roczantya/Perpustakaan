import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Jurnal extends Kategori{
    private int ISSN;
    private int IDAuthor;
    private String Judul;
    private int TahunTerbit;
    private int IDKondisiBarang;
    private String EdisiTerbitan;
    private Cover sampulcover;
    private int IDPenerbit;
    private int Jurnalpinjam;
    private int Jurnaltersedia;
    private int totaljurnal;
    

    public enum Cover{
        HardCover, SoftCover
    }

    public Jurnal() {
        // Empty constructor
    }

    public Jurnal(int ISSN, int IDAuthor, String Judul, int TahunTerbit, int IDKondisiBarang, String EdisiTerbitan, Cover sampulcover, int IDPenerbit, int Jurnalpinjam, int Jurnaltersedia, int totaljurnal) {
        this.ISSN = ISSN;
        this.IDAuthor = IDAuthor;
        this.Judul = Judul;
        this.TahunTerbit = TahunTerbit;
        this.IDKondisiBarang = IDKondisiBarang;
        this.EdisiTerbitan = EdisiTerbitan;
        this.sampulcover = sampulcover;
        this.IDPenerbit = IDPenerbit;
        this.Jurnalpinjam = Jurnalpinjam;
        this.Jurnaltersedia = Jurnaltersedia;
        this.totaljurnal = totaljurnal;
    }

    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    public int getIDAuthor() {
        return IDAuthor;
    }

    public void setIDAuthor(int IDAuthor) {
        this.IDAuthor = IDAuthor;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public int getTahunTerbit() {
        return TahunTerbit;
    }

    public void setTahunTerbit(int TahunTerbit) {
        this.TahunTerbit = TahunTerbit;
    }

    public int getIDKondisiBarang() {
        return IDKondisiBarang;
    }

    public void setIDKondisiBarang(int IDKondisiBarang) {
        this.IDKondisiBarang = IDKondisiBarang;
    }

    public String getEdisiTerbitan() {
        return EdisiTerbitan;
    }

    public void setEdisiTerbitan(String EdisiTerbitan) {
        this.EdisiTerbitan = EdisiTerbitan;
    }

    public Cover getSampulcover() {
        return sampulcover;
    }

    public void setSampulcover(Cover sampulcover) {
        this.sampulcover = sampulcover;
    }

    public int getIDPenerbit() {
        return IDPenerbit;
    }

    public void setIDPenerbit(int IDPenerbit) {
        this.IDPenerbit = IDPenerbit;
    }

    public int getJurnalpinjam() {
        return Jurnalpinjam;
    }

    public void setJurnalpinjam(int Jurnalpinjam) {
        this.Jurnalpinjam = Jurnalpinjam;
    }

    public int getJurnaltersedia() {
        return Jurnaltersedia;
    }

    public void setJurnaltersedia(int Jurnaltersedia) {
        this.Jurnaltersedia = Jurnaltersedia;
    }

    public int getTotaljurnal() {
        return totaljurnal;
    }

    public void setTotaljurnal(int totaljurnal) {
        this.totaljurnal = totaljurnal;
    }

    public static void main(String[] args) {
        // Create a list of sample journals
        List<Jurnal> daftarJurnal = new ArrayList<>();

        daftarJurnal.add(new Jurnal(129856, 1, "Journal of Science", 2022, 1, "Volume 1", Jurnal.Cover.HardCover, 1, 5, 3, 8));
        daftarJurnal.add(new Jurnal(987654, 2, "Journal of Medicine", 2021, 2, "Issue 3", Jurnal.Cover.SoftCover,1,4,5,10));
        // Specify the output file name
        String namaFile = "Output_Jurnal.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            // Write header for the table
            writer.write(String.format("%-10s | %-30s | %-20s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s | %-10s%n",
                    "ISSN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Jurnal", "ID Author", "ID Penerbit"));
            writer.write("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

            // Write data for each journal to the table
            for (Jurnal jurnal : daftarJurnal) {
                writer.write(String.format("%-10d | %-30s | %-20s | %-10d | %-15s | %-15d | %-10d | %-12d | %-10d | %-10d%n",
                        jurnal.getISSN(),
                        jurnal.getJudul(),
                        jurnal.getEdisiTerbitan(),
                        jurnal.getTahunTerbit(),
                        jurnal.getSampulcover().toString(),
                        jurnal.getJurnalpinjam(),
                        jurnal.getJurnaltersedia(),
                        jurnal.getTotaljurnal(),
                        jurnal.getIDAuthor(),
                        jurnal.getIDPenerbit()));
            }

            System.out.println("Data for journals has been saved to " + namaFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file: " + e.getMessage());
        }
    }

    // Method to create a list of sample journals

        // Add some sample journals to the list
        
}



