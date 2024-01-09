package function_or_method;

import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        if(1==n) return 1;
        return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" is "+fact(n));
    }
}
