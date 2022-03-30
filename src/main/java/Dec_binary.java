import java.util.*;
public class Dec_binary{
    public static void main(String[] args) {
        int   n,rem=1,d=1;
        String t="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number ");
        n = sc.nextInt();
        for(int  i=1;n!=0;i++)
        {
           rem=n%2;
           t+=rem;
           n=n/2;
        }
        StringBuilder sb=new StringBuilder(t);
        sb.reverse();
        System.out.println("Binary equivalent of the decimal number is ");
        System.out.print(sb);


    }
}

