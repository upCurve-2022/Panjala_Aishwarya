import java.util.*;
public class    Binary_search{
    public static void main(String[] args) {
        int  n,key=0,k,i=0,f=0,mid,l=0,h=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = sc.nextInt();
        int a[]=new int[n];
        k=n;
        l=0;
        h=k-1;
        mid=(l+h)/2;
        System.out.println("Enter the sorted Array values ");
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
            mid=(l+h)/2;
            if(key>a[mid])
            {
                l=mid+1;
            }
            if(key<a[mid])
            {
                h=mid-1;
            }
            if(key==a[mid])
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("The key is found in the array ");
        else
            System.out.println("The key is not found in the array ");



    }
}




