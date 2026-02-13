/*public class s5 {//Reverse
    public static int  reverse(int n){
        int sign = 1;
        int ld;
        int rev = 0;
        if(n<0){
            sign = -1;
            n = -n;
        }
        while(n>0){
            ld = n % 10;
            rev = rev*10+ld;
            n = n/10;
        }
        return rev*sign;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-987));
    }
}*/

//Palindrome
/*public class s5 {
    public static int  reverse(int n){
        int sign = 1;
        int ld;
        int rev = 0;
        if(n<0){
            sign = -1;
            n = -n;
        }
        while(n>0){
            ld = n % 10;
            rev = rev*10+ld;
            n = n/10;
        }
        return rev*sign;
    }
    public static boolean isPalindrome(int n){
        return reverse(n) == n;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-987));
        System.out.println(isPalindrome(121));
    }
}*/

//Retuen Sum From 1 to N
/*public class s5{
    public static int sumOfN(int n){
        if(n<=0){
            return 0;
        }
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum+=i;
    }
    return sum;}
    public static void main(String args[]){
        System.out.println(sumOfN(100));

    }}*/

/*public class s5{
    public static int Power(int a , int b ){
        int result = 1;
        for(int i = 1; i<=b ; i++){
            result = result * a;
        }
        return result;
    }
    public static void main(String args[]){
        System.out.println(Power(5 , 3));
    }
}*/

///Primes
/*public class s5{
    public static boolean isPrime(int n){
        boolean isprime = true;
        if(n<=1){
            return false;
        }
        
        for(int i = 2 ; i*i<=n ; i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
         return isprime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(9));
        System.out.println(isPrime(7));
    }

}*/

//primerange
/*public class s5{
    public static boolean isPrime(int n){
        boolean isprime = true;
        if(n<=1){
            return false;
        }
        
        for(int i = 2 ; i*i<=n ; i++){
            if(n%i == 0){
                isprime = false;
                break;
            }
        }
         return isprime;
    }
    public static int countTillN(int n){
        int count = 0;
        for(int i = 1 ; i<=n ; i++){
            if(isPrime(i))
                count++;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countTillN(9));
        System.out.println(isPrime(7));
    }

}*/

//Armstrong Number Check
public class s5{
    public static boolean isArmstrong(int n){
        if(n<0){
            return false;
        }
        int power = 0;
        int ld_1;
        int ld_2;
        int x = n;
        int y = n;
        int sum = 0;
        while(n>0){
            ld_1 = n % 10;
            power++;
            n = n/10;
        }
        while(y>0){
            ld_2 = y%10;
            sum+=(int)Math.pow(ld_2 , power);
            y = y / 10;
        }
        if(sum == x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(-98));
        System.out.println(isArmstrong(0));
    }
}
    

