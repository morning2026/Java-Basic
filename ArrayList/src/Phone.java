import java.util.ArrayList;

public class Phone {
    private String brand;
    private int price;

    public Phone(){

    }
    public Phone(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public static ArrayList<Phone> GetPhone(ArrayList<Phone> list1){//可以传集合，另外static直接调用不用类型
        ArrayList<Phone> result = new ArrayList<>();//返回多个数据，先放进集合，再把整个返回
        for (int i = 0;i < list1.size(); i++ ){
            Phone ph = list1.get(i);
            if(ph.getPrice()<=5000){
                result.add(ph);
            }
        }
        return result;
    }

    public static void main(String[] args){
        ArrayList <Phone> list1 = new ArrayList<>();
        Phone ph1 = new Phone("小米",1000);
        Phone ph2 = new Phone("苹果",8000);
        Phone ph3 = new Phone("铁锤",3000);
        list1.add(ph1);
        list1.add(ph2);
        list1.add(ph3);
        ArrayList <Phone> list2 = GetPhone(list1);
        for(int i=0;i< list2.size();i++){
            Phone ph = list2.get(i);
            System.out.print(ph.getBrand()+' '+ph.getPrice()+'\n');//不要直接输出集合
        }
    }
}
