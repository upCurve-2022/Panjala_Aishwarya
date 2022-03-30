import java.util.*;
public class Swap1 {
    public static void main(String[] args)
    {
        int a=0,b=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=sc.nextInt();
        System.out.println("Enter the second number");
        b= sc.nextInt();
        System.out.println("The two numbers before swapping  "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The two numbers after swapping  "+a+" "+b);

    }

}
