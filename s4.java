/*public class s4{
    public static int reverse(int n){
        int sign = 1;
        int rev = 0;
        int ld;
        if(n<0){
            sign = -1;
            n = -n;
        }
        while(n>0){
            ld = n % 10;
            rev = rev*10+ld;
            n = n / 10;
        }
        return rev*sign;
    }
    public static boolean palindrome(int n){
        return n == reverse(n);
    }
    public static void main(String args[]){
        reverse(987);
        palindrome(987);
    }
}*/
public class s4{
    public static void power(int a , int b){
        int pow = 1;
        for(int i = 1 ; i<=b ; i++){
            pow = pow*a;
        }
        System.out.println(pow);
    }
    public static void main(String args[]){
        power(2 , 3);
    }

}

