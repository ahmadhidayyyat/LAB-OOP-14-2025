public class Book extends LibraryItem {
    String author ;
    int maximalHari = 14 ;
    int denda = 10000 ;

    public Book (String title, int itemId, String author) {
        super(title, itemId, false) ;
        this.author = author ;
        

     
    }
    @Override 
    public String getDescription() {
        return "Buku: " + title + " oleh " + author + ", ID: " + itemId;
    }
    @Override
    public String borrowItem(int days) {
        if (isBorrowed) {
            return "ITEM SUDAH DIPINJAMKAN" ;
        }
        if (days > maximalHari){
            return "MAKSIMAL PINJAMAN SELAMA 14 HARI " ;

        }
        isBorrowed = true;
        return "item " + title + " berhasil dipinjam selama " + days + " hari";
    
    }
    @Override 
    public double calculateFine(int daysLate){
        return daysLate * denda ;
        
    }
}
