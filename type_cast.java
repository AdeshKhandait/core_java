public class type_cast {
    public static void main(String[] args) {
        
        // Conversion: lower range to higher range without explicit declaration
        byte c = 35;
        int a = c;

        // type casting: casting with explicit declaration
        int ab = (int)5.6;
        System.out.println(ab);


        // Conversion: If out of range
        int jk = 257;
        byte k = (byte)jk; // it takes modelus with highest value of lower datatype
        System.out.println(k);

    }
}
