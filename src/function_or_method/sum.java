package function_or_method;
import java.util.Scanner;
public class sum {
    public static int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println(add(a,b));
    }
}
