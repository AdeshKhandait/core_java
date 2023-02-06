import javax.swing.plaf.synth.SynthStyle;

class Mobile{
    // Static variables which called when class is instantiated only once 
    static String type = "SmartPhone";                        
    String brand;
    int price;


    static{
        type = "SmartPhone1";
        System.out.println("In Static.....");
    }

    public void show(){
        System.out.println(brand);
        System.out.println(price);
        System.out.println(type);
    }

    // Static method while instantiated object as pararmeter
    public static void show1(Mobile obj){
        System.out.println("in static...");
        System.out.println("Brand: " + obj.brand + " Price: " + obj.price + " Type: " + Mobile.type);

    }
}

public class statics {

    public static void main(String[] args) {
        
    Mobile test = new Mobile();
    test.brand = "Apple";
    test.price = 10000;
    
    // Mobile.show1(test);`

    }
}
