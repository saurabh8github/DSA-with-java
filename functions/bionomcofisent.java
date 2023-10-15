package functions;
import java.util.*;
public class bionomcofisent {
    public static int fact(int a){
        int f=1;
        for( int i=1; i<=a; i++){
            f=f*i;

        }
        return f;
    }
    public static int bincoef(int n, int r){
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int bincoef=fact_n/(fact_r * fact_nmr);
        return bincoef;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int fact_n=sc.nextInt();
        int fact_r=sc.nextInt();
        System.out.println(bincoef(fact_n, fact_r));
        
        sc.close();
    }
}
