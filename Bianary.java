import java.util.*;
class Binary{
    int binary(int a){
        int pow = 0;
        int dec = 0;

        while(a > 0){
            int rem = a % 10;
            dec = dec + rem * (int)Math.pow(2, pow);
            pow++;
            a = a / 10;
        }
        return dec;
    }
    
    public static void main(String[] args){
        Binary b = new Binary();
        int res = b.binary(10101);
        System.out.println(res);
    }
}
