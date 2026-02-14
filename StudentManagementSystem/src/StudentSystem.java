import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem {
    public static void addStudent(ArrayList<Student> list1) {
        System.out.print("添加学生");
        Student stu1 = new Student();//空参构造先构造学生对象
        Scanner sc = new Scanner(System.in);
        String id = null;
        while (true) {
            id = sc.next();
            boolean flag = contains(list1, id);
            if (flag) System.out.println("id重复");
            else {
                stu1.setId(id);
                break;
            }
        }
        String name = sc.next();
        stu1.setName(name);
        int age = sc.nextInt();
        stu1.setAge(age);
        list1.add(stu1);
    }

    public static void delStudent(ArrayList<Student> list1) {
        System.out.print("删除学生");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if (list1.isEmpty()) {//替换size==0
            System.out.println("无学生可以删除");
            return;
        }
        int index = getIndex(list1, id);
        if (index >= 0)
            list1.remove(index);
        else
            System.out.println("不存在");
    }

    public static void updateStudent(ArrayList<Student> list1) {
        System.out.print("修改学生");
        Scanner sc = new Scanner(System.in);
        int index;
        String id = sc.next();
        if (list1.isEmpty()) {//替换size==0
            System.out.println("无学生可以修改");
            return;
        }
        index = getIndex(list1, id);
        if (index == -1) {
            System.out.println("不存在");
            return;
        }
        Student stu = list1.get(index);
        String name =sc.next();
        stu.setName(name);
        int age = sc.nextInt();
        stu.setAge(age);
        list1.remove(index);
        list1.add(stu);
    }

    public static void queryStudent(ArrayList<Student> list1){
        System.out.print("查询学生");
        if(list1.size()==0){
            System.out.print("当前无学生");
            return;
        }
        System.out.println("id\t姓名\t年龄\t");
        for(int i=0;i< list1.size();i++){
            Student stu = list1.get(i);
            System.out.println(stu.getId()+'\t'+stu.getName()+'\t'+stu.getAge()+'\n');
        }
    }

    public static boolean contains(ArrayList<Student> list1,String id){
        if (list1.isEmpty()) return false;//一句不用大括号，直接这么写。
        for (Student stu : list1) {//不用索引遍历，直接用类型
            if (id.equals(stu.getId())) {
                return true;
            }
        }
        return false;
    }
    public static int getIndex(ArrayList<Student> list1,String id){
        for (int i=0;i< list1.size();i++) {
            Student stu = list1.get(i);
            if (id.equals(stu.getId())) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        ArrayList<Student> list1 = new ArrayList<>();
        loop:while(true){
            System.out.print("————————————欢迎来到学生管理系统————————————");
            System.out.print("1.添加学生");
            System.out.print("2.删除学生");
            System.out.print("3.修改学生");
            System.out.print("4.查询学生");
            System.out.print("5.退出");
            System.out.print("您的选择是：");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> addStudent(list1);//-> 不是:
                case 2 -> delStudent(list1);
                case 3 -> updateStudent(list1);
                case 4 -> queryStudent(list1);
                case 5 ->{
                    System.out.print("退出");
                    break loop;//switch本身就是循环 或者停止虚拟机运行 System.exit(0);
                }
                default ->{
                    System.out.print("输入错误");
                }
            }
        }
    }
}
