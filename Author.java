public class Author {
    private int IDAuthor;
    private String NamaAuthor;
    private String AlamatAuthor;
    private int notelpon;
    private Gender gender; // Gender field to store the enum value

    // Enum for Gender
    public enum Gender {
        MALE, FEMALE
    }

    public Author(){

    }
    public Author(int IDAuthor, String NamaAuthor, String AlamatAuthor, int notelpon, Gender gender) {
        this.IDAuthor = IDAuthor;
        this.NamaAuthor = NamaAuthor;
        this.AlamatAuthor = AlamatAuthor;
        this.notelpon = notelpon;
        this.gender = gender;
    }
    // Getter and Setter for IDAuthor
    public int getIDAuthor() {
        return IDAuthor;
    }

    public void setIDAuthor(int IDAuthor) {
        this.IDAuthor = IDAuthor;
    }

    // Getter and Setter for NamaAuthor
    public String getNamaAuthor() {
        return NamaAuthor;
    }

    public void setNamaAuthor(String NamaAuthor) {
        this.NamaAuthor = NamaAuthor;
    }

    // Getter and Setter for AlamatAuthor
    public String getAlamatAuthor() {
        return AlamatAuthor;
    }

    public void setAlamatAuthor(String AlamatAuthor) {
        this.AlamatAuthor = AlamatAuthor;
    }

    // Getter and Setter for notelpon
    public int getNotelpon() {
        return notelpon;
    }

    public void setNotelpon(int notelpon) {
        this.notelpon = notelpon;
    }

    // Getter and Setter for gender
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
}
