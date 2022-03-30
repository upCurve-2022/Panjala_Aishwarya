import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        long  n,f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        System.out.println("The Factorial of given number is  ");
        for(long i=n;i!=0;i--)
        {
            f=f*i;
        }
        System.out.print(f);


    }
}

