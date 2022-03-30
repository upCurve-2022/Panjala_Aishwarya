import java.util.*;
public class Odd_Even {
    public static void main(String[] args)
    {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n= sc.nextInt();
        if((n&1)==1)
            System.out.println("The Given number "+n+" is Odd ");
        else
            System.out.println("The Given number "+n+" is Even ");
    }
}
