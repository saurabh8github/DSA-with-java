package functions;
import java.util.*;
public class functionpara {
    public static void printhelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
    }
    public static int calculatesum(int a, int b){//parameters or formal parameters
        
        int sum=a + b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum = calculatesum(a,b);//actual parameter
         System.out.println("Sum is : "+ sum);
         sc.close();
    }
    
}
