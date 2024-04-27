import java.time.LocalDate;

public class Kembali {
    private static int TimeIDTransaksiKembali= 101;
    private int IDTransaksiKembali;
    private int IDUser;
    private LocalDate dateTime;
    private LocalDate futureDateTime;
    private int totalbukudipinjam;
    private boolean statustelat;
    private long lamaHariDipinjam;

    public Kembali() {
        // Empty constructor
    }

    public Kembali(int IDUser, LocalDate dateTime, LocalDate futureDateTime, int totalbukudipinjam, boolean statustelat, long lamaHariDipinjam) {
        this.IDTransaksiKembali = ++TimeIDTransaksiKembali;
        this.IDUser = IDUser;
        this.dateTime = dateTime;
        this.futureDateTime = futureDateTime;
        this.totalbukudipinjam = totalbukudipinjam;
        this.statustelat = statustelat;
        this.lamaHariDipinjam = lamaHariDipinjam;
    }

    public int getIDTransaksiKembali() {
        return IDTransaksiKembali;
    }

    public void setIDTransaksiKembali() {
        this.IDTransaksiKembali = ++TimeIDTransaksiKembali;
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

    public boolean getstatustelat() {
        return statustelat;
    }

    public void setStatustelat(boolean statustelat) {
        this.statustelat = statustelat;
    }

    public long getlamaHariDipinjam() {
        return lamaHariDipinjam;
    }

    public void setlamaHariDipinjam(long lamaHariDipinjam) {
        this.lamaHariDipinjam = lamaHariDipinjam;
    }

}
