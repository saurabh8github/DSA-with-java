package functions;
import java.util.*;

public class factorial {
    public static int fact(int a){
        int f=1;
        for( int i=1; i<=a; i++){
            f=f*i;

        }
        return f;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int b= sc.nextInt();
        System.out.println(fact(b));
        sc.close();
    }
    
}
