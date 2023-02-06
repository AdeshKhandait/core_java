import javax.sound.midi.SysexMessage;

public class Switch {

    public static void main(String[] args) {
        


        int n = 7;

        switch(n){
            case 1: 
                System.out.println("Mon.day");
                break;
            case 2: 
                System.out.println("T.day");
                break;
            case 3: 
                System.out.println("W.day");
                break;
            case 4: 
                System.out.println("Th.day");
                break;
            case 5: 
                System.out.println("F.day");
                break;
            case 6: 
                System.out.println("Sat.day");
                break;
            case 7: 
                System.out.println("Sun.day");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
    }
    
}
