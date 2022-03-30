 import java.util.*;
public class Bin_decimal{
    public static void main(String[] args) {
        int   rem=0,p=0;
        String n="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number ");
        n = sc.nextLine();
        for(int  i=n.length()-1;i!=-1;i--)
        {
           if(n.charAt(i)=='1')
           {
               rem=rem+(int)Math.pow(2,p);
               p++;
           }
           else
               p++;
        }
        System.out.println("Decimal Equivalent of the given binary number is ");
        System.out.print(rem);


    }
}
