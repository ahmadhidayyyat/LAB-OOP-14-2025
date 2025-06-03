public class Hero {
    String name ;
    int health ;
    int attackPower;


    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void atack (){
        System.out.println( this.name +" " + "Menyerang dengan kekuatan" + " "+ this.attackPower   );
    }


}