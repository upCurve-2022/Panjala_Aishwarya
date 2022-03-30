import java.util.*;
public class Linear_search{
    public static void main(String[] args) {
        int  n,key=0,k,i=0,f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        int a[]=new int[n];
        k=n;
        System.out.println("Enter the Array values ");
        while(n!=0)
        {
            int b=sc.nextInt();
            a[i]=b;
            i++;
            n--;
        }
        System.out.println("Enter the key to be found ");
        key= sc.nextInt();
        for(int j=0;j<k;j++)
        {
            if(a[j]==key)
                f=1;
        }
        if(f==1)
            System.out.println("The key is found in the array ");
        else
            System.out.println("The key is not found in the array ");



    }
}




