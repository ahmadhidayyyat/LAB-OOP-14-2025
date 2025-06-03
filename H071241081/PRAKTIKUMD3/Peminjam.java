public class Peminjam {
    String nama ;
    String id ;
    int lamaPengembalian ;
    double denda ;
    boolean isDenda ;
    
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
    
    public String getNamaPeminjam() {
        return nama;

    }
    public String getIdPeminjam (){
        return id ;
    }

    public Peminjam(String nama, String id, int lamaPengembalian, double denda, boolean isDenda ) {
        this.nama = nama;
        this.id = id;
        this.lamaPengembalian = lamaPengembalian ;
        this.denda = denda ;
        this.isDenda = isDenda ;
    }

    // setiap class harus pake dua constructor satu yang menerima parameter satu yg tidak
    // isina yg nda pake parameter kasi kosongmi kalo nda ada atribut ArrayList di class nu
}
