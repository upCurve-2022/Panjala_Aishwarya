import java.util.*;
public class Rev_string{
    public static void main(String[] args) {
        String str="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        str= sc.nextLine();
        System.out.println("The Reverse of string is  ");
        for(int i=str.length()-1;i!=-1;i--)
        {
            System.out.print(str.charAt(i));
        }



    }
}


