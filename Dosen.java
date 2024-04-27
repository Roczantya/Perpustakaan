import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dosen extends Pengguna {
    private int NID;
    private String Nama;
    private String Alamat;
    private int notelpon;
    private Gender gender; 
    private Fakultas fakultas;
    private Prodi prodi;

    public enum Gender {
        MALE, FEMALE
    }

    public enum Fakultas{
        MAN, VCD, IMT
    }

    public enum Prodi {
        IBM, CBM, COM, DBM, GD, DI, DMI, FSD, AI
    }

    public Dosen() {
        // Empty constructor
    }
    public Dosen(int NID, String Nama, String Alamat, int notelpon, Gender gender, Fakultas fakultas, Prodi prodi) {
        this.NID = NID;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.notelpon = notelpon;
        this.gender = gender;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }

    // Getter and Setter methods for all fields
    public int getNID() {
        return NID;
    }

    public void setNID(int NID) {
        this.NID = NID;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public int getNotelpon() {
        return notelpon;
    }

    public void setNotelpon(int notelpon) {
        this.notelpon = notelpon;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public static void main(String[] args) {
        // Create a list of Dosen (lecturer) objects
        List<Dosen> dosenList = new ArrayList<>();
        
        // Populate the list with sample Dosen objects
        dosenList.add(new Dosen(101, "Dr. John Doe", "123 Main St", 123456789, Dosen.Gender.MALE, Dosen.Fakultas.MAN, Dosen.Prodi.IBM));
        dosenList.add(new Dosen(102, "Prof. Jane Smith", "456 Oak Ave", 987654321, Dosen.Gender.FEMALE, Dosen.Fakultas.VCD, Dosen.Prodi.COM));

        // Print table header
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("| NID    | Nama            | Alamat          | No. Telepon   | Gender | Fakultas | Prodi    |");
        System.out.println("-----------------------------------------------------------------------------------------");

        // Print each Dosen's details in table format to console
        for (Dosen dosen : dosenList) {
            System.out.format("| %-7d| %-16s| %-15s| %-14d| %-7s| %-9s| %-9s|%n",
                    dosen.getNID(), dosen.getNama(), dosen.getAlamat(),
                    dosen.getNotelpon(), dosen.getGender(), dosen.getFakultas(), dosen.getProdi());
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        // Write the Dosen details to a text file
        String fileName = "dosen_details.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("NID    | Nama            | Alamat          | No. Telepon   | Gender | Fakultas | Prodi\n");
            for (Dosen dosen : dosenList) {
                writer.write(String.format("%-7d| %-16s| %-15s| %-14d| %-7s| %-9s| %-9s%n",
                        dosen.getNID(), dosen.getNama(), dosen.getAlamat(),
                        dosen.getNotelpon(), dosen.getGender(), dosen.getFakultas(), dosen.getProdi()));
            }
            System.out.println("Dosen details written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
