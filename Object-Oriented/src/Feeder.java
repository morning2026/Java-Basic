public class Feeder {
    int age;
    String name;
    public Feeder(){}
    public Feeder(int age,String name){
        this.age = age;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }//set和get要记得写

    public void keepPet(Animals animals, String something){
        System.out.println(age+name+ animals.age+animals.color+something);
    }
    public static void main(String[] args){
        Feeder f = new Feeder(1,"甲");
        Cat c = new Cat(2,"r");
        f.keepPet(c,"鱼");
    }
}
