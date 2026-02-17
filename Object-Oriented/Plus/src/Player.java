public abstract class Player extends Person{//注意抽象方法即抽象类

    public Player() {
    }

    public Player(String name,int age) {
        super(name, age);
    }

    public abstract void learn();//抽象方法强制重写且没有方法体

}
