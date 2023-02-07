class human{

    private String name;
    private int age;


    // default constructor
    public human() {
        this.name = "human";
        this.age = 0;
    }

    // parameterized constructor
    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}

public class constructor {

    public static void main(String[] args) {

        human h1 = new human("John", 30);
        human h2 = new human("Babu", 25);
        System.out.println(h1.getAge() + " " + h1.getName());
        System.out.println(h2.getAge() + " " + h2.getName());

        
    }
}
