/*public class s6 {
    public static void main(String args[]){
        for(int i = 1; i<=4 ; i++){
            for(int j = 1 ;j<=i ; j++){
                System.err.print("*");
            }
            System.out.println();
           
        }
        
    }
    
}*/

/*public class s6{
    public static void main(String args[]){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/

//Inverted Star Pattern
/*public class s6{
    public static void main(String args[]){
        for(int i = 1 ; i<=4 ; i++){

            for(int j = 4 ; j>=i ; j--){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}*/

/*public class s6 {
    public static void main(String args[]) {

        for (int i = 1; i <= 4; i++) {

            
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}*/
/*import java.util.*;
public class s6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int count = 0;
        while(n>0){
            ld = n % 10;
            if(ld % 2 == 0){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}*/


/*public class s6{
    public static boolean isPrime(int n){
        boolean prime = true;
        if(n == 1){
            System.out.println("Neither Prime Nor Composite");
        }
        for(int i = 2 ; i<n ; i++){
            if(n % i == 0){
                prime = false;
            }}
            return prime;}
     public static void PrimeCount(int n){
        int count = 0;
        for(int i = 2 ; i<=n ; i++){
             if(isPrime(i)){
                 count++;
             }
             
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        PrimeCount(8);
}}/* */

//Fibonacci Series
public static int fibonacci(int n) {

    if (n == 1) return 0;
    if (n == 2) return 1;

    int a = 0;
    int b = 1;

    while (n > 2) {
        int c = a + b;
        a = b;
        b = c;
        n--;
    }

    return b;
}
public static void main(String args[]){
   System.out.println(fibonacci(9)); 
}