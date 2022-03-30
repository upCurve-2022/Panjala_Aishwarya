import java.util.*;
public class Swap2 {
    public static void main(String[] args) {
        int a = 0, b = 0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        a = sc.nextInt();
        System.out.println("Enter the second number ");
        b = sc.nextInt();
        System.out.println("Enter the third number ");
        c = sc.nextInt();
        System.out.println("The three numbers before swapping  " + a + " " + b+" "+c);
        a = a + b+c;
        b = a - b-c;
        c= a-(b+c);
        a = a - b-c;
        System.out.println("The three numbers after swapping  " + a + " " + b+" "+c);

    }
}

