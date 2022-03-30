import java.util.*;
public class Power{
    public static void main(String[] args) {
        long  n,pow=1,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextLong();
        System.out.println("Enter the power value ");
        p= sc.nextLong();
        System.out.println("The Power of the given number is");
        for(long i=p;i!=0;i--)
        {
            pow=pow*n;
        }
        System.out.print(pow);


    }
}

