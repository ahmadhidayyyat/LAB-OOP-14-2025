public class DVD extends LibraryItem {
    int duration ;
    private int maximalHari = 7  ;
    private int denda = 25000 ;

    public DVD(String title, int itemId, int duration) {
        super(title, itemId, false) ;
        this.duration = duration ;
    
    }
    
    @Override
    public String getDescription() {
        return "DVD: " + title + ", durasi " + duration + " menit, ID: " + itemId;
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
    public double calculateFine (int daysLate) {
        return daysLate * denda ;
    }

    
}
