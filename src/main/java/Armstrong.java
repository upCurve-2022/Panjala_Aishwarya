import java.util.*;
public class Armstrong{
    public static void main(String[] args) {
        int  n,c=0,d=0,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  three digit number ");
        n = sc.nextInt();
        k=n;
        while(n!=0)
        {
            d=n%10;
            c=c+(int)Math.pow(d,3);
            n=n/10;
        }
        if(c==k)
            System.out.println("The number is an armstrong number ");
        else
            System.out.println("The number is not an armstrong number ");


    }
}



