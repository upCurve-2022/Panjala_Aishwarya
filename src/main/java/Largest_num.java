import java.util.*;
public class Largest_num {
    public static void main(String[] args) {
        int a = 0, b = 0,c=0,fl=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        a = sc.nextInt();
        System.out.println("Enter the second number ");
        b = sc.nextInt();
        System.out.println("Enter the third number ");
        c = sc.nextInt();
        if(a>=b&&a>=c)
        {
            System.out.println("The First largest number is "+a);
        }
        else if(b>=c&&b>=a)
        {
            System.out.println("The First largest number is "+b);
        }
        else
        {
            System.out.println("The First largest number is "+c);
        }
        if((a>b&&a<c)||(a>c&&a<b))
        {
            System.out.println("The second largest number is "+a);
        }
        else if(b>a&&b<c||b>c&&b<a)
        {
            System.out.println("The second largest number is "+b);
        }
        else
        {
            System.out.println("The second largest number is "+c);
        }


    }
}


