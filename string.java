public class string {
    public static void main(String[] args) {
        

        // StringBuilder or String are immutable similar to string in python
        // StringBuffer is mutable


        // what happens behind the scenes is that in stringBuilder
        // there is string contants pool which create new string if not already present
        //  if string already present then sent the reference to it
        // that is not case in stringBuffer


        // StringBuilder
        String s1 = "Navin";
        System.out.println(s1.hashCode());
        s1 = s1 + "Reddy";
        String s2 = "Navin";
        // After chaging the string references changes
        System.out.println(s1.hashCode() +" " + s2.hashCode());

        // String Buffer
        StringBuffer sb = new StringBuffer("Adesh");
        System.out.println(sb.hashCode());
        sb.append(" " + "Khandait");
        // Here references will not change
        System.out.println(sb.hashCode());
        sb.ensureCapacity(10);
        System.out.println("Capacity: " + sb.capacity());

    }
}
