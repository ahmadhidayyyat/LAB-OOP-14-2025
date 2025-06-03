package LIVECODING;

public class Box {
    private double length ;
    private double width ;
    private double height ;

    
    public void setLength(double length) {
       
        if (length <= 1 ) {
            this.length = 1 ;
            
        }else {
            this.length = length ;
        }
    }


    public void setWidth(double width) {
        
        if (width <= 1 ) {
            this.width = 1 ;
            
        }else {
            this.width = width ;
        }
    }


    public void setHeigt(double height) {
        if (height <= 1 ) {
            this.height = 1 ;
            
        }else {
            this.height = height ;
        }

    }


    public Box(double length, double width, double heigt) {
        setLength (length) ;
        setWidth (width) ;
        setHeigt(height) ;
    }

    public double calculatedVolume () {
        return height * width * length ;
    }

    public boolean isCube ()  {
        if (height == width && height == length && length == width){
            return true;
        }else {
            return false ;
        }
    }

public static void main(String[] args) {
    Box box1 = new Box(-1, -1, -1) ;




    System.out.println("Volume Box adalah " + box1.calculatedVolume()) ;
    System.out.println ("Apakah Box Merupakan Kubus " + box1.isCube()) ;


}
}

