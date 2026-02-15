public class Animals {
    int age;
    String color;
    public Animals(){}
    public Animals(int age,String color){
        this.age = age;
        this.color = color;
    }
    void eat(String something){
        System.out.println("eat "+something);
    }
}
