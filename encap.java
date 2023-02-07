class human {
    
    private String name;
    private int age;
          
    // this = is self reference keyword
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

class encap{
    public static void main(String[] args) {
    human obj = new human();
    obj.setAge(45);
    System.out.println(obj.getAge());
    }
}