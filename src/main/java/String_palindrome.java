import java.util.*;
public class String_palindrome{
    public static void main(String[] args) {
        String str="",p="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        str= sc.nextLine();
        for(int i=str.length()-1;i!=-1;i--)
        {
           p+=str.charAt(i);
        }
        if(str.equals(p))
            System.out.println("The given String is a palindrome ");
        else
            System.out.println("The given String is not a palindrome ");




    }
}



