import java.util.*;
public class Seq4{
    public static void main(String[] args) {
        int  n,a=1,b=4,c=7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        System.out.print(a+" "+b+" "+c+" ");
        for(int i=3;i<n;i++)
        {
            int p=a+b+c;
            System.out.print(p+" ");
            a=b;
            b=c;
            c=p;
        }


    }
}

