import java.util.Scanner;
public class StringCompare {
    public boolean Compare(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        StringBuilder sb = new StringBuilder(a);
        for(int i=0;i<=a.length();i++){
            String c1 = sb.substring(0,i);
            String c2 = sb.substring(i);
            //System.out.print(c2+c1+' ');
            if(b.equals(c2+c1)){//看清楚题意
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        //System.out.print(a+' '+b+'\n');
        StringCompare rn = new StringCompare();
        System.out.print(rn.Compare(a,b));
    }
}
