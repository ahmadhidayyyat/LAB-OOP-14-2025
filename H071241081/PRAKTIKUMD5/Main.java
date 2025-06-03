import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fighter hero1 = new Fighter("Wahyu", 100, 20); 
        Wizard hero2 = new Wizard("Adit", 100, 20);
        Archer hero3 = new Archer("Ivan", 100, 20) ;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Pilih Karakter:");
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.print("Masukkan Pilihan: ");
            int karakter = scanner.nextInt() ;
            if (karakter < 1 || karakter > 3) {
                System.out.println("Piihan tidak valid");
                continue;
            
        }
            System.out.println("Menu:");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("Pilih Aksi: ");
            int aksi = scanner.nextInt();

            if ( aksi < 1 || aksi > 2 ) {
                System.out.println("Pilhan tidak valid ");
            } 
            if (aksi == 1) {
                switch (karakter) {
                    case 1:
                    hero3.atack();                        
                        break;
                    case 2 :
                    hero2.atack();
                    case 3 :
                    hero1. atack();
                    default:
                        break;
                } 
            }else {
                break ;
            }

            }

    }

}
