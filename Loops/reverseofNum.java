package Loops;
import java.util.*;
public class reverseofNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        while(num>0){
            int lastDigit = num%10;
            System.out.println(lastDigit);
            num = num/10;
        }
        sc.close();
    }
}
