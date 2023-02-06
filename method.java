import javax.sound.midi.VoiceStatus;

class Calculator{

    // method Overiding: it does care about return values only parameter
    //  if change return type is will show error message

    public void add(int n1, int n2){
        System.out.println( n1 + n2);
    }

    public void add(int n1, int n2, int n3){
        System.out.println(n1 + n2 + n3);
    }

    public void add(double n1, double n2, double n3){
        System.out.println(n1 + n2 + n3);
    }
}


public class method {
    public static void main(String[] args) {
    

        // Any new object created at heap memory and not stack where all the methods will have separate static inspite where is created
        // whether in class or outside of class
        
        Calculator obj = new Calculator();
        obj.add(1.0, 2.0,6.0);

    }
}
