class computer{

    public void PlayMusic(){
        System.out.println("Playing music..");
    }

    public String getPen(int cost) {
        if (cost >= 10)
            return "Pen";
    
        return "Nothing";
    }
}




class Calculator{
        
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

public class oops{

    public static void main(String[] args) {
        
        // Calculator cal = new Calculator();
        // System.out.println(cal.add(4, 5));


        computer obj = new computer();

        obj.PlayMusic();
        System.out.println(obj.getPen(4));
    }

}