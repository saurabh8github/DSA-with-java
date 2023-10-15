package functions;
import java.util.*;
public class productOftwonum {
    public static int multiply(int a, int b){
        int prod =a * b;
        return prod;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int prod= multiply(a, b);
       System.out.println("The product is: "+prod);
        sc.close();
    }
}
