import java.util.*;
public class Seq2{
    public static void main(String[] args) {
        int  n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if((i&1)==1)
                System.out.print(-i+" ");
            else
                System.out.print(i+" ");

        }


    }
}
