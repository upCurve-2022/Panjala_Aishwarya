import java.util.*;
public class Reverse_num{
    public static void main(String[] args) {
        long  n,rev=0,d=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("The reverse of the given number is "+rev);


    }
}



