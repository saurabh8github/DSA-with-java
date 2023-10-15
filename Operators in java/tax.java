import java.util.*;
public class tax {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int inc=sc.nextInt();

        if(inc<500000){
            System.out.println("No tax to pay");
        }
        else if(inc>=500000 && inc <100000){
            double tax=inc*0.2;
            System.out.println("total tax to pay is :"+ tax);
        }
        else{
            double tax=inc*0.3;
            System.out.println("You have to pay:"+ tax);
        }
        sc.close();
    }
}
