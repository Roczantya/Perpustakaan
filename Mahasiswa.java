import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Mahasiswa extends Pengguna {
    
    private int NIM;
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

    public Mahasiswa() {
        // Empty constructor
    }

    public Mahasiswa(int NIM, String Nama, String Alamat, int notelpon, Gender gender, Fakultas fakultas, Prodi prodi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.notelpon = notelpon;
        this.gender = gender;
        this.fakultas = fakultas;
        this.prodi = prodi;

    }

    // Getter and Setter methods for all fields
    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
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
        // Create a list of Mahasiswa (student) objects
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        
        // Populate the list with sample Mahasiswa objects
        mahasiswaList.add(new Mahasiswa(123456, "John Doe", "123 Main St", 123456789, Mahasiswa.Gender.MALE, Mahasiswa.Fakultas.MAN, Mahasiswa.Prodi.IBM));
        mahasiswaList.add(new Mahasiswa(789012, "Jane Smith", "456 Oak Ave", 987654321, Mahasiswa.Gender.FEMALE, Mahasiswa.Fakultas.VCD, Mahasiswa.Prodi.COM));

        // Print table header
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("| NIM    | Nama       | Alamat         | No. Telepon  | Gender | Fakultas | Program Studi |");
        System.out.println("----------------------------------------------------------------------------------------");

        // Print each Mahasiswa's details in table format to console
        for (Mahasiswa mahasiswa : mahasiswaList) {
            System.out.format("| %-7d| %-11s| %-15s| %-13d| %-7s| %-9s| %-13s|%n",
                    mahasiswa.getNIM(), mahasiswa.getNama(), mahasiswa.getAlamat(),
                    mahasiswa.getNotelpon(), mahasiswa.getGender(), mahasiswa.getFakultas(), mahasiswa.getProdi());
        }

        System.out.println("----------------------------------------------------------------------------------------");

        // Write the Mahasiswa details to a text file
        String fileName = "Output.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("NIM    | Nama       | Alamat         | No. Telepon  | Gender | Fakultas | Program Studi\n");
            for (Mahasiswa mahasiswa : mahasiswaList) {
                writer.write(String.format("%-7d| %-11s| %-15s| %-13d| %-7s| %-9s| %-13s%n",
                        mahasiswa.getNIM(), mahasiswa.getNama(), mahasiswa.getAlamat(),
                        mahasiswa.getNotelpon(), mahasiswa.getGender(), mahasiswa.getFakultas(), mahasiswa.getProdi()));
            }
            System.out.println("Mahasiswa details written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
