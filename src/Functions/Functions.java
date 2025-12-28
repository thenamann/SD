package Functions;

import java.util.Scanner;

public class Functions 
{
    public static int Product(int a, int b)// function declaration
    {
        int c = a*b;

        return c;
    }

    public static int Factorial(int a) //function for calculate factorial;
    {
        if(a==0)
            return 1;

        int result = 1;
        for(int i=a;i>0;i--)
        {
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("naman");

        Scanner sc = new Scanner(System.in); // input

        //taking inputs
        int a = sc.nextInt(); 
        int b = sc.nextInt();

        int c = Product(a, b);//calling function and storing in a variable
        System.out.println(c);

        
        int d = Factorial(a);
        System.out.println(d);
    }
}