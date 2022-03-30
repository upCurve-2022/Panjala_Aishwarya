import java.util.*;
public class Prime_num_range{
    public static void main(String[] args) {
        int  n,m,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range of values ");
        n = sc.nextInt();
        m=sc.nextInt();
        System.out.println("The prime numbers in given range ");
        for(int i=n;i<=m;i++)
        {
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0) {
                    f = 1;
                    break;
                }
            }
            if(f!=1)
                System.out.println(i);
            f=0;
        }


    }
}

