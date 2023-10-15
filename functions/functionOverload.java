package functions;
public class functionOverload {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //fnc ovrld using data type 
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(3,5));
        System.out.println(sum(3,4, 5));
        System.out.println(sum(3.8f , 7.6f));
    }
}
