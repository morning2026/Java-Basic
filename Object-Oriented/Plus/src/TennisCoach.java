public class TennisCoach extends Coach implements English{

    public TennisCoach() {
    }

    @Override
    public void teach() {
        System.out.println("教乒乓");
    }

    public TennisCoach(String name,int age) {
        super(name, age);
    }


    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
