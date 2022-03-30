import java.util.*;
public class Seq6{
    public static void main(String[] args) {
        int  n,i=1,j=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        while(j<=n)
        {
            if(j%3!=0)
            {
                System.out.print(i+" ");
                i=i+4*j;
            }
            j++;
        }
    }
}

