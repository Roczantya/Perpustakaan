import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Staff extends Pengguna{
    private int NIS;
    private String Nama;
    private String Alamat;
    private int notelpon;
    private Gender gender; 

    public enum Gender {
        MALE, FEMALE
    }

    public Staff(){

    }

    public Staff(int NIS, String Nama, String Alamat, int notelpon, Gender gender) {
        this.NIS = NIS;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.notelpon = notelpon;
        this.gender = gender;
    }

    // Getter and Setter methods for all fields
    public int getNIS() {
        return NIS;
    }

    public void setNIS(int NIS) {
        this.NIS = NIS;
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

    public static void main(String[] args) {
        // Create a list of Staff objects
        List<Staff> staffList = new ArrayList<>();
        
        // Populate the list with sample Staff objects
        staffList.add(new Staff(101, "John Doe", "123 Main St", 123456789, Staff.Gender.MALE));
        staffList.add(new Staff(102, "Jane Smith", "456 Oak Ave", 987654321, Staff.Gender.FEMALE));

        // Print table header
        System.out.println("-----------------------------------------------------------");
        System.out.println("| NIS   | Nama       | Alamat       | No. Telepon | Gender |");
        System.out.println("-----------------------------------------------------------");

        // Print each Staff's details in table format to console
        for (Staff staff : staffList) {
            System.out.format("| %-5d | %-10s | %-12s | %-11d | %-6s |%n",
                    staff.getNIS(), staff.getNama(), staff.getAlamat(),
                    staff.getNotelpon(), staff.getGender());
        }

        System.out.println("-----------------------------------------------------------");

        // Write the Staff details to a text file
        String fileName = "staff_details.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("NIS   | Nama       | Alamat       | No. Telepon | Gender\n");
            for (Staff staff : staffList) {
                writer.write(String.format("%-5d | %-10s | %-12s | %-11d | %-6s %n",
                        staff.getNIS(), staff.getNama(), staff.getAlamat(),
                        staff.getNotelpon(), staff.getGender()));
            }
            System.out.println("Staff details written to " + fileName);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
}
}
