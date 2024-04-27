import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CD extends Kategori {
    private int ID_CD;
    private int IDAuthor;
    private String Judul;
    private int TahunTerbit;
    private int CDpinjam;
    private int CDtersedia;
    private int totalCD;

    public CD(){

    }

    public CD(int ID_CD, int IDAuthor, String Judul, int TahunTerbit, int CDpinjam, int CDtersedia, int totalCD) {
        this.ID_CD = ID_CD;
        this.IDAuthor = IDAuthor;
        this.Judul = Judul;
        this.TahunTerbit = TahunTerbit;
        this.CDpinjam = CDpinjam;
        this.CDtersedia = CDtersedia;
        this.totalCD = totalCD;
    }

    public int getID_CD() {
        return ID_CD;
    }

    public void setID_CD(int ID_CD) {
        this.ID_CD = ID_CD;
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

    public int getCDpinjam() {
        return CDpinjam;
    }

    public void setCDpinjam(int CDpinjam) {
        this.CDpinjam = CDpinjam;
    }

    public int getCDtersedia() {
        return CDtersedia;
    }

    public void setCDtersedia(int CDtersedia) {
        this.CDtersedia = CDtersedia;
    }

    public int getTotalCD() {
        return totalCD;
    }

    public void setTotalCD(int totalCD) {
        this.totalCD = totalCD;
    }

    public static void main(String[] args) {
        // Create a list of sample journals
        List<CD> daftarCD = new ArrayList<>();
        // Create sample CDs and add them to the list
        daftarCD.add(new CD(129856, 1, "Journal of Science", 2022,  5, 3, 8));
        daftarCD.add(new CD(987654, 2, "Journal of Medicine", 2021, 4,5,9));
        
        // Specify the output file name
        String namaFile = "Output_CD.txt";

try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
    // Write header for the table
    writer.write(String.format("%-10s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s%n",
            "ID CD","ID Author", "Judul", "Tahun", "Pinjam", "Tersedia", "Total CD"));
    writer.write("--------------------------------------------------------------------------------------------------------------------\n");

    // Write data for each CD to the table
    for (CD CD : daftarCD) {
        writer.write(String.format("%-10d | %-10d | %-20s | %-10d | %-10d | %-10d | %-10d%n",
                CD.getID_CD(),
                CD.getIDAuthor(),
                CD.getJudul(),
                CD.getTahunTerbit(),
                CD.getCDpinjam(),
                CD.getCDtersedia(),
                CD.getTotalCD()));
    }

    System.out.println("Data for CDs has been saved to " + namaFile);
} catch (IOException e) {
    System.out.println("An error occurred while writing to file: " + e.getMessage());
}
}
}