class Decimal{
    int decimal(int x){
        int dec = 0;
        int sign = 1;
        if(x<0){
            sign = -1;
        }
        while(x>0){
            int rem = x%2;
            x = x/2;
            dec = rem+(dec*10);
        }
        return dec*sign;
    }
    public static void main(String[] args){
        Decimal s = new Decimal();
        System.out.println(s.decimal(5));
    }
}