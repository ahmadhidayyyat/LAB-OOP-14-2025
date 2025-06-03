import java.util.ArrayList;
// sisa behavior nama buku dan idnya 
public class Perpustakaan {
    String namaPeminjam ;
    String idPeminjam ;
    int lamaPengembalian ;

    ArrayList<Peminjam> daftarPeminjam;
    ArrayList <Buku> daftarBuku ;

    public Perpustakaan(String namaPeminjam, int lamaPengembalian) {
        this.namaPeminjam = namaPeminjam;
        this.lamaPengembalian = lamaPengembalian;
    }


    // setiap class harus pake dua constructor satu yang menerima parameter satu yg tidak
    // isina yg nda pake parameter kasi kosongmi kalo nda ada atribut ArrayList di class nu
    
    public void pelanggaranPengembalian(Peminjam peminjam) {
        int batasWaktu = 3;
        int dendaPerHari = 50000;
        
        
        if (peminjam.lamaPengembalian> batasWaktu) {
            int totalDenda = (peminjam.lamaPengembalian - batasWaktu) * dendaPerHari;
          
            peminjam.isDenda = true;
            peminjam.denda = totalDenda;
        }
       
       
    }

    public String cekIzinPeminjam(String namaAtauId) {
        for (Peminjam p : daftarPeminjam) {
            if (p.getNamaPeminjam().equalsIgnoreCase(namaAtauId) || 
                p.getIdPeminjam().equals(namaAtauId)) {
                    return "DIJINKAN (ID: " + p.getIdPeminjam() + ", Nama: " + p.getNamaPeminjam() + ")"; 
            }
        }
        return namaAtauId + " " +"Tidak terdapat dalam list peminjam" ;
    }

    public void apakahDiaAdaDenda(Peminjam peminjam){
        if (peminjam.isDenda) {
            System.out.println(peminjam.nama + " memiliki denda" + peminjam.denda);
        } else {
            System.out.println(peminjam.nama + "tidak memuliki denda");
        }
    }

    public Perpustakaan() {
        daftarPeminjam = new ArrayList<>();
        daftarBuku = new ArrayList<>() ;
    }

    public void tambahPeminjam(Peminjam peminjam) {
        daftarPeminjam.add(peminjam);
    }

    public void tambahBuku (Buku buku) {
        daftarBuku.add(buku);
    }

    public void setLamaPengembalian(int lamaPengembalian) {
        this.lamaPengembalian = lamaPengembalian;
    }

    public Peminjam cariPeminjam(String idPeminjam) {
        for (Peminjam p : daftarPeminjam) {
            if (p.getIdPeminjam().equals(idPeminjam)) {
                return p;
            }
        }
        return null;
    }
    
    public String cariBuku(String namaBuku) {
        
        for (Buku b : daftarBuku) {
            if (b.getNamaBuku().equals(namaBuku)) {
               return "Buku ditemukan: " + b.getNamaBuku();
           
        }   
    }
        return "Buku '" + namaBuku + "' tidak ditemukan";
    }
    
    
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        


        Peminjam peminjam1 = new Peminjam("Ivan", "01", 1 , 0, false);
        Peminjam peminjam2 = new Peminjam("Aril", "02" , 5 , 0, false); 
    
        Buku buku1 = new Buku("01", "Retorika", 150);
        Buku buku2 = new Buku("02", "Bumi Manusia", 320);
        perpustakaan.tambahPeminjam(peminjam2);
        perpustakaan.tambahPeminjam(peminjam1);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        System.out.println(peminjam1);

        System.out.println("--CEK IZIN PINJAM--");
        System.out.println(perpustakaan.cekIzinPeminjam("ivan"));

        System.out.println(perpustakaan.cekIzinPeminjam("yardan"));


        System.out.println("--CEK DENDA--");
        perpustakaan.pelanggaranPengembalian(peminjam2);
        perpustakaan.apakahDiaAdaDenda(peminjam2);


        System.out.println("--CEK BUKU--");
        System.out.println(perpustakaan.cariBuku ("Retorika"));
    }
}
