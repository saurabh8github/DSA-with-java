package Loops;
import java.util.*;
public class sumofn {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=1;
            i++;
        }
        System.out.println("Sum of given number:"+sum);
        sc.close();
    }
}
