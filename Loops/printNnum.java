package Loops;
import java.util.*;
public class printNnum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count =1;
        while(count<=range){
            System.out.println(count);
            count++;
        }
        System.out.println();
        sc.close();
    }
}
