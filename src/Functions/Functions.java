package Functions;

import java.util.Scanner;

public class Functions 
{
    public static int Product(int a, int b)
    {
        int c = a*b;

        return c;
    }
    public static void main(String[] args){
        System.out.println("naman");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Product(a, b);

        System.out.println(c);
    }
}