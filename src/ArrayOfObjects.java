public class ArrayOfObjects {
    private String id;
    private String name;
    private int quantity;
    private int price;
    public ArrayOfObjects(){
    }
    public ArrayOfObjects(String id,String name,int quantity,int price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public static void main(String[] args){
        ArrayOfObjects good1 = new ArrayOfObjects("1","a",20,3);
        ArrayOfObjects good2 = new ArrayOfObjects("2","b",30,4);
        ArrayOfObjects good3 = new ArrayOfObjects("3","c",40,5);
        ArrayOfObjects[] arr1 = new ArrayOfObjects[]{good1,good2,good3};//注意跟平常的用法不一样，这里是数组，另外数组的括号紧贴数据类型,注意给出了数据就不要给长度
    }
}
//其他补充要点，输入体系不能混用，nextInt和nextLine不能并存
