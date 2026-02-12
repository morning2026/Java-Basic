import java.util.Scanner;
public class RomanNumerals {

    public String Roman(String original){
        String[] num = {"","I","II","III","IV","V","VI","VII","VIII","VIIII"};//还可以写一个嵌套，用switch匹配
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<original.length();i++){
            char c = original.charAt(i);
            if ('0'<=c && c<='9'){
                sb.append(num[(int)(c-'0')]);//只是方法用到的写在方法内，强制类型转换是（类型）数值
            }
            else{
                System.out.print("错误");
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        RomanNumerals rn = new RomanNumerals();
        System.out.print(rn.Roman(original));
    }
}
