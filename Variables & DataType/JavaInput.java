import java.util.Scanner;

public class JavaInput {
    public static void main(String args[]){
        Scanner scn =new Scanner(System.in);
        //String input = scn.next();
        //System.out.println(input);

       // String name = scn.nextLine();
        //System.out.println(name);

        int number= scn.nextInt();
        System.out.print(number);
        scn.close();
    }
}
