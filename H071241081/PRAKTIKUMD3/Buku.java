public class Buku {
    String id ;
    String namaBuku ;
    int hal ;

    // bikinko atribut String dipinjamOleh karena soal na minta atribut class main saling berinteraksi

    public String getIdBuku() {
        return id;
    }
    public String getNamaBuku() {
        return namaBuku;
    }
    public int getHal() {
        return hal;
    }

    public String sistemPinjaman (){
        return id + " " + namaBuku ; 
    }

    public Buku (String id, String namaBuku, int hal){
        this.id = id ;
        this.namaBuku = namaBuku;
        this.hal  = hal ;   
    }

    // setiap class harus pake dua constructor satu yang menerima parameter satu yg tidak
    // isina yg nda pake parameter kasi kosongmi kalo nda ada atribut ArrayList di class nu
}