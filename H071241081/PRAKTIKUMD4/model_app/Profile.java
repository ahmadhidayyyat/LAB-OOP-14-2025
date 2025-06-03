package model_app ;
public class Profile {
    /*
     * TODO:
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
public String fullName ;
public int age ;
public String hobby ;
public User user ;
public String nickname ;


public Profile(User user) {
    this.user = user;
}

}