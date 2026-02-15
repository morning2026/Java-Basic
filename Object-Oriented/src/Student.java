public class Student extends Person{
    String school;
    public Student(){
        this(null,0,null);//虚拟机不再调用父类构造函数 默认是super（）
    }
    public Student(String name,int age,String school){
        super(name,age);
        this.school = school;
    }

    @Override
    void work() {
        System.out.println("学生在读书");
    }
}
