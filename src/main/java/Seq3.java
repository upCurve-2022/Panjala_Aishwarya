import java.util.*;
public class Seq3{
    public static void main(String[] args) {
        int  n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print((int)Math.pow(i,i)+" ");
        }


    }
}

