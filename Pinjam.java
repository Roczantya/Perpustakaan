import java.time.LocalDate;

public class Pinjam {
    private static int TimeIDTransaksiPinjam = 0;
    private int IDTransaksiPinjam;
    private int IDUser;
    private LocalDate dateTime;
    private LocalDate futureDateTime;
    private int totalbukudipinjam;

    public Pinjam(){

    }
    public Pinjam(int IDUser, LocalDate dateTime, LocalDate futureDateTime, int totalbukudipinjam) {
        this.IDTransaksiPinjam = ++TimeIDTransaksiPinjam;
        this.IDUser = IDUser;
        this.dateTime = dateTime;
        this.futureDateTime = dateTime.plusDays(7);
        this.totalbukudipinjam = totalbukudipinjam;
    }

    // Getter and Setter methods for all fields
    public int getIDTransaksiPinjam() {
        return IDTransaksiPinjam;
    }

    public void setIDTransaksiPinjam() {
        this.IDTransaksiPinjam = ++TimeIDTransaksiPinjam;
    }

   

    public int getIDUser() {
        return IDUser;
    }

    public void setIDUser(int IDUser) {
        this.IDUser = IDUser;
    }

    public LocalDate getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDate getFutureDateTime() {
        return futureDateTime;
    }

    public void setFutureDateTime(LocalDate futureDateTime) {
        this.futureDateTime = futureDateTime;
    }

    public int getTotalbukudipinjam() {
        return totalbukudipinjam;
    }

    public void setTotalbukudipinjam(int totalbukudipinjam) {
        this.totalbukudipinjam = totalbukudipinjam;
    }



    }
  
