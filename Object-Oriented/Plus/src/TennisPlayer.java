public class TennisPlayer extends Player implements English {

    public TennisPlayer() {
    }

    public TennisPlayer(String name,int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学乒乓");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
