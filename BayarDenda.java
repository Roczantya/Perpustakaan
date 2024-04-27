import java.time.LocalDate;

public class BayarDenda {
    private static int TimeIDTransaksiBayarDenda = 301;
    private int IDTransaksiDenda;
    private int IDPustakawan;
    private int IDUser;
    private LocalDate dateTime;
    private int totalbukudipinjam;
    private boolean statustelat;
    private boolean statusrusak;
    private int totalbarang;
    private int totalrusak;
    private int totalhargayangrusak;
    private int totaldenda;
    private int jumlahbayar;

    public BayarDenda() {
        // Empty constructor
    }

    public BayarDenda(int IDPustakawan, int IDUser, LocalDate dateTime, int totalbukudipinjam, boolean statustelat, boolean statusrusak, int totalbarang, int totalrusak, int totalhargayangrusak, int totaldenda, int jumlahbayar ) {
        this.IDTransaksiDenda = ++TimeIDTransaksiBayarDenda;
        this.IDPustakawan = IDPustakawan;
        this.IDUser = IDUser;
        this.dateTime = dateTime;
        this.totalbukudipinjam = totalbukudipinjam;
        this.statustelat = statustelat;
        this.statusrusak = statusrusak;
        this.totalbarang = totalbarang;
        this.totalrusak = totalrusak;
        this.totalhargayangrusak = totalhargayangrusak;
        this.totaldenda = totaldenda;
        this.jumlahbayar = jumlahbayar;
    }

    // Getter and Setter methods
    public int getIDTransaksiDenda() {
        return IDTransaksiDenda;
    }

    public void setIDTransaksiDenda() {
        this.IDTransaksiDenda = ++TimeIDTransaksiBayarDenda;
    }

    public int getIDPustakawan() {
        return IDPustakawan;
    }

    public void setIDPustakawan(int IDPustakawan) {
        this.IDPustakawan = IDPustakawan;
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


    public int getTotalbukudipinjam() {
        return totalbukudipinjam;
    }

    public void setTotalbukudipinjam(int totalbukudipinjam) {
        this.totalbukudipinjam = totalbukudipinjam;
    }

    public boolean isStatustelat() {
        return statustelat;
    }

    public void setStatustelat(boolean statustelat) {
        this.statustelat = statustelat;
    }

    public boolean isStatusrusak() {
        return statusrusak;
    }

    public void setStatusrusak(boolean statusrusak) {
        this.statusrusak = statusrusak;
    }

    public int getTotalbarang() {
        return totalbarang;
    }

    public void setTotalbarang(int totalbarang) {
        this.totalbarang = totalbarang;
    }

    public int getTotalrusak() {
        return totalrusak;
    }

    public void setTotalrusak(int totalrusak) {
        this.totalrusak = totalrusak;
    }

    public int getTotalhargayangrusak() {
        return totalhargayangrusak;
    }

    public void setTotalhargayangrusak(int totalhargayangrusak) {
        this.totalhargayangrusak = totalhargayangrusak;
    }

    public int getTotaldenda() {
        return totaldenda;
    }

    public void setTotaldenda(int totaldenda) {
        this.totaldenda = totaldenda;
    }

    public int getJumlahbayar() {
        return jumlahbayar;
    }

    public void setJumlahbayar(int jumlahbayar) {
        this.jumlahbayar = jumlahbayar;
    }
}
