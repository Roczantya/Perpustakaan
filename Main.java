import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
   

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = true;

        while (valid) {
            System.out.println("Choose one from Menu Below");
            System.out.println("==========================================================");
            System.out.println("1. Pinjam buku");
            System.out.println("2. Kembali buku");
            System.out.println("3. Tabel barang tersedia");
            System.out.println("4. Exit");
            System.out.println("===========================================================");
            System.out.println("Your Choice: ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan ID User:");
                    int userID = scan.nextInt();
                    System.out.println("Masukkan jumlah buku yang ingin dipinjam:");
                    int jumlahBuku = scan.nextInt();
                    LocalDate today = LocalDate.now();
                    LocalDate returnDate = today.plusDays(7);

                    Pinjam pinjam = new Pinjam(userID, today, returnDate, jumlahBuku);
                    System.out.println("Transaksi peminjaman berhasil dibuat dengan detail sebagai berikut:");
                    System.out.println("ID Transaksi: " + pinjam.getIDTransaksiPinjam());
                    System.out.println("ID User: " + pinjam.getIDUser());
                    System.out.println("Tanggal Pinjam: " + pinjam.getDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                    System.out.println("Tanggal Pengembalian: " + pinjam.getFutureDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                    System.out.println("Total Buku Dipinjam: " + pinjam.getTotalbukudipinjam());

                    // Save transaction to text file
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("Transaksi_Pinjam.txt", true))) {
                        writer.write("ID Transaksi: " + pinjam.getIDTransaksiPinjam() + ", ");
                        writer.write("ID User: " + pinjam.getIDUser() + ", ");
                        writer.write("Tanggal Pinjam: " + pinjam.getDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ", ");
                        writer.write("Tanggal Pengembalian: " + pinjam.getFutureDateTime().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + ", ");
                        writer.write("Total Buku Dipinjam: " + pinjam.getTotalbukudipinjam());
                        writer.newLine();
                        System.out.println("Transaksi telah disimpan di file.");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat menyimpan transaksi: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Masukkan ID Transaksi untuk pengembalian:");
                    int transaksiID = scan.nextInt();
                    // Membaca file transaksi untuk mencari data yang sesuai
                    try (BufferedReader reader = new BufferedReader(new FileReader("Transaksi_Pinjam.txt"))) {
                        String line;
                        boolean found = false;
                        while ((line = reader.readLine()) != null) {
                            String transactionIDString = "ID Transaksi: " + transaksiID + ",";
                            if (line.contains(transactionIDString)) {
                                System.out.println("Detail Transaksi:");
                                System.out.println(line);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Transaksi dengan ID tersebut tidak ditemukan.");
                        }
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                    }
                    // Memulai proses pengembalian buku
                    break;
    
                case 3:
                    System.out.println("Anda ingin melihat Jurnal/Buku/Majalah/CD");
                    int Choosen = scan.nextInt();
                    switch (Choosen) {
                        case 1:
                            System.out.println("Daftar Buku:");
                            System.out.println(String.format("%-10s | %-30s | %-20s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s%n",
                            "ISBN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Buku", "ID Author", "ID Penerbit"));
                            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        
                            try (BufferedReader br = new BufferedReader(new FileReader("Output.txt"))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    System.out.println(line);
                                }
                            } catch (IOException e) {
                                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                            }

                            break;
                        case 2:
                        System.out.println("Daftar Majalah:");
                        System.out.println(String.format("%-10s | %-30s | %-20s | %-10s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s s%n",
                        "ISBN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Majalah", "ID Author", "ID Penerbit"));
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                            try (BufferedReader br = new BufferedReader(new FileReader("Output_Majalah.txt"))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    System.out.println(line);
                                }
                            } catch (IOException e) {
                                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                            }
                            break;

                        case 3:
                            System.out.println("Daftar Jurnal:");
                            System.out.println(String.format("%-10s | %-30s | %-20s | %-10s | %-15s | %-15s | %-10s | %-10s | %-10s | %-10s%n",
                    "ISSN", "Judul", "Edisi Terbitan", "Tahun", "Sampul", "Pinjam", "Tersedia", "Total Jurnal", "ID Author", "ID Penerbit"));
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                            try (BufferedReader br = new BufferedReader(new FileReader("Output_Jurnal.txt"))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    System.out.println(line);
                                }
                            } catch (IOException e) {
                                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                            }
                            break;

                        case 4:
                           System.out.println("Daftar CD");
                           System.out.println(String.format("%-10s | %-10s | %-20s | %-10s | %-10s | %-10s | %-10s%n",
            "ID CD","ID Author", "Judul", "Tahun", "Pinjam", "Tersedia", "Total CD"));
                            System.out.println("--------------------------------------------------------------------------------------------------------------------\n");

                            try (BufferedReader br = new BufferedReader(new FileReader("Output_CD.txt"))) {
                                String line;
                                while ((line = br.readLine()) != null) {
                                    System.out.println(line);
                                }
                            } catch (IOException e) {
                                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
                            }
                            break;
                        default:
                            break;
                    }
                    
                break;

                case 4:
                    valid = false;
                     // Keluar dari loop
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }


        scan.close();

    }
        
    

}
