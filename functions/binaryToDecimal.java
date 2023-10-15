package functions;

public class binaryToDecimal {
    public static void binToDec(int binNum){
        int myNum= binNum;
        int dec=0;
        int pow=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            dec = dec + (lastdigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;

        }
        System.out.print("Decimal of binary number "+ myNum +"="+dec);
    }
    public static void main(String args[]){
        binToDec(101);
    }
}
