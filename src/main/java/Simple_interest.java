import java.util.*;
public class Simple_interest {
    public static void main(String[] args)
    {
        double p_amount=0.0,rate=0.0,sim_interest=0.0;
        int time=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p_amount=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        rate=sc.nextDouble();
        System.out.println("Enter the time period ");
        time=sc.nextInt();
        sim_interest=(p_amount*time*rate)/100;
        System.out.println("The simple interest is "+sim_interest);
        System.out.println("The  Amount is "+(p_amount+sim_interest));



    }
}
