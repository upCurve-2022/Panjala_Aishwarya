import java.util.*;
public class Whole_fraction {
    public static void main(String[] args)
    {
        double i=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fractional number");
        i= sc.nextDouble();
        int w=(int)i;
        System.out.println("The given Fractional number is "+i);
        System.out.println("The whole number is "+w);
        System.out.println("The fractional number is "+(i-w));
    }
}
