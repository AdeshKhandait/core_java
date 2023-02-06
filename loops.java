import java.security.Principal;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class loops {

    public static void main(String[] args) {
        
        int i = 4;


        // Fails if the coditions are not supported
        while (i<=4) {
            System.out.println("while: Hi" + i);
            i++;
        } 


        // it Run atleast once
        do{
            System.out.println("Do:Hi "+ i);
        }while(i<=4);
    
        
        System.out.println("FOR");

        for(int j = 0; j <=5; j++){
            System.out.println("HI" + j);
        }
    
    
    
    
    }
    
}
