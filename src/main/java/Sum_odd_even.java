import java.util.*;
public class Sum_odd_even{
    public static void main(String[] args) {
        int n,even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            if((i&1)==1)
                odd+=i;
            else
                even+=i;
        }
        System.out.println("The Sum of odd numbers from 1-n is "+odd);
        System.out.println("The Sum of even numbers from 0-n is "+even);


    }
}


