package model_app ;

public class User {

    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */

    
    private String password ;
    public Profile profile ;
    
    public String getPassword() {
        return password;
    }
    
    public String username ;
    public String getUsername() {
       return username;
   }
     public User(String userName, String password) {
        this.username = userName;
        this.password = password;
     }



     


     


}