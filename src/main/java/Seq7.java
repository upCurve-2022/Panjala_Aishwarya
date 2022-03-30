import java.util.*;
public class Seq7{
    public static void main(String[] args) {
        int  n,p=1,l=1,x=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number ");
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
           p=p+i*i;
           if((i&1)==1)
               System.out.print(-p+" ");
           else
               System.out.print(p+" ");
        }


    }
}


