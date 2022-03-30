import java.util.*;
public class Words{
    public static void main(String[] args) {
        int  n,d=0,rev=0;
        String s="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        while (rev!=0)
        {
            int a=rev%10;
            switch(a)
            {
                case 0:s=s+" zero";
                    break;
                case 1:s=s+" one";
                    break;
                case 2:s=s+" two";
                    break;
                case 3:s=s+" three";
                    break;
                case 4:s=s+" four";
                    break;
                case 5:s=s+" five";
                    break;
                case 6:s=s+" six";
                    break;
                case 7:s=s+" seven";
                    break;
                case 8:s=s+" eight";
                    break;
                case 9:s=s+" nine";
                    break;
            }
            rev=rev/10;
        }
        System.out.println("The given number in words is  "+s);


    }
}




