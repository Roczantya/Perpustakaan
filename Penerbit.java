public class Penerbit {
    private int NIS;
    private String Nama;
    private String Alamat;
    private int notelpon;

    public Penerbit() {
        // Empty constructor
    }

    public Penerbit(int NIS, String Nama, String Alamat, int notelpon) {
        this.NIS = NIS;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.notelpon = notelpon;
    }
    // Getter and Setter methods
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

}
