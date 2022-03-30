import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        int   n,a=0,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        System.out.println("The Fibonacci series is  ");
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }



    }
}

