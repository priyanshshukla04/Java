import java.util.Scanner;

public class Recursion_Iterative {
    //Factorial Problem
    static int factorial_recursion(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else
            return x * factorial_recursion(x - 1);
    }

    static int factorial_iterative(int y) {
        if (y == 0 || y == 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i <= y; i++) {
                result *= i;
            }
            return result;
        }
    }

    //Fibonacci series
    static int fibo_iteration(int a) {
        int q = 0;
        int w = 1;
        int next = 1;
        System.out.print(q);
        System.out.print(" " + w);
        for (int i = 2; i < a; i++) {
            next = q + w;
            System.out.print(" " + next);
            q = w;
            w = next;
        }
        return 0;
    }

    static int fibo_recursion(int t){
        if(t==0){
            return 0;
        }
        if(t==1 || t==2){
            return 1;
        }
        return fibo_recursion(t-2)+fibo_recursion(t-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial using recursion is: "+factorial_recursion(num));
        System.out.println("Factorial using iterative is: "+factorial_iterative(num));

        System.out.println("Enter the length of fibonacci series: ");
        int len = sc.nextInt();
        System.out.println("########Fibonacci using recursion#######");
        for (int i = 0; i < len; i++) {
            System.out.print(fibo_recursion(i)+" ");
        }
        System.out.println();
        System.out.println("########Fibonacci using iteration#######");
        fibo_iteration(len);
    }
}