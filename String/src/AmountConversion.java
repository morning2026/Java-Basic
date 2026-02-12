import java.util.Scanner;
public class AmountConversion {
    public int Conversion(String amount){
        int result = 0;
        char[] num1 = {'零','壹','贰','叁','肆','伍','陆','柒','捌','玖'};
        String num2 = new String(num1);//转化为字符串
        for(int i=0;i<amount.length();i+=2){
            char c = amount.charAt(i);
            System.out.print(c);
            result*=10;
            result+=num2.indexOf(c);//在哪里找啊！！
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String amount = sc.next();
        AmountConversion ac = new AmountConversion();
        System.out.println(ac.Conversion(amount));
    }
}
