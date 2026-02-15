public class Dog extends Animals{
    public Dog(){}
    public Dog(int age,String color){
        super(age,color);
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
