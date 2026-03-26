//Gcd
import java.security.cert.X509CRL;
import java.util.*;
/*public class s8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int gcd = 0;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for(int i = 1 ; i<=n1 && i<=n2 ;i++ ){
            if(n1%i == 0 && n2 % i ==0){
                gcd = i;

            }
        }
        System.out.println(gcd);


    }
}*/

//The GCD Using Euclids Division Algorithm
/*public class s8{
    public static int gcd(int n1 , int n2){
        while(n2!=0){
           int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1, n2));

    }
}*/

//lcm
/*public class s8{
    public static int gcd(int n1 , int n2){
        while(n2!=0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
    public static int lcm(int n1 , int n2){
        int Lcm;
        Lcm = (n1*n2)/gcd(n1, n2);
        return Lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(lcm(n1, n2));
        sc.close();
    }
    
}*/
/*public class s8{
     public static int fibonacci(int n){
        int a= 0;
        int b = 1;
        int i = 2;
        while(i<=n){
            int c = a+b;
            a= b;
            b=c;
            i++;
        }
        return b;
     }
     public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(fibonacci(n));
     }
}*/

//Fibonacci Series Till n
/*public class s8{
    public static void fibonacci(int n){
        int a = 0;
        System.out.println(0);
        int b = 1;
        int i = 2;
        while(i<=n){
            if(n == 0){
                System.out.println("0");
            }
            else if(n==1){
                System.out.println("1");
            }
            else{
            int c= a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;}
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}*/

//Sum Of Fibonacci
/*public class s8{//Only if first 2 terms or not given
    public static int fibonacci(int n){
        int a = 0;
        int b = 1;
        int i  = 2;
        int sum = 0;
        while(i<=n){
            int c = a+b;
            sum+=c;
            a = b;
            b = c;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        }
}*/

//Power Of A number 
public class s8{
    public static int pow(int a , int b){
        int result = 1;
        for(int i = 1 ; i<=b;i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner Sc  = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        System.out.println(pow(a, b));
    }
}