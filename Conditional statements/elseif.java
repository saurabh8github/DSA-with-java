import java.util.*;
public class elseif {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();

        if(age>18){
            System.out.println("young");
        }
        else if(age<18 && age>13){
            System.out.println("Teenage");
        }
        else{
            System.out.println("Child");
        }
        sc.close();
    }
}
