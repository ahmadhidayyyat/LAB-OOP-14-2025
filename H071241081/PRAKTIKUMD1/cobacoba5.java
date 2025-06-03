import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cobacoba5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        System.out.print(" MASUKKAN PASWORD :");
        String password = input.nextLine() ;

        List<String> cekAlasan = cekValid(password);

        if (cekAlasan.isEmpty()){
            System.out.println(" PASWORD VALID ");
        } else {
            System.out.println("PASSWORD TIDAK VALID");
            System.out.println("Alasan:");
            for (String alasan : cekAlasan){
            System.out.println(" -" + alasan);
            }
        }
    
    
    }


        public static List<String> cekValid (String password){

            boolean cekHurufbesar = false ;
            boolean cekHurufkecil = false ;
            boolean cekAngka = false ;
            boolean cekJumlah = false ;

            List <String> cekAlasan = new ArrayList<>() ;

            if (password.length() <8 ){
                cekAlasan.add(" PASSWORD YANG DIBERIKAN HARUS LEBIH DARI 8") ;
            } else {
                cekJumlah = true ;
            }

            for (char karakter : password.toCharArray() ) {
                if ( Character.isUpperCase(karakter)){
                    cekHurufbesar= true ;
                }else if ( Character.isLowerCase(karakter)){
                    cekHurufkecil =true ;
                }else if ( Character.isDigit(karakter)){
                    cekAngka = true ;
                }
                
                if (cekAngka && cekHurufbesar && cekHurufkecil && cekJumlah) {
                break ;
                }

                }
                
                if (!cekAngka){
                    cekAlasan.add (" PASWORD YANG DIBERIKAN HARUS MENGANDUNG HURUF ANGKA") ;
                } 
                if (!cekHurufbesar){
                    cekAlasan.add (" PASWORD YANG DIBERIKAN HARUS MENGANDUNG HURUF BESAR");
                }
                if (! cekHurufkecil){
                    cekAlasan.add (" PASWORD YANG DIBERIKAN HARUS MENGANDUNG ANGKA") ;
                }
            
        
        
        return cekAlasan ;
    }

}