/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_prime = true;
        if(n<=1){
            System.out.println("Not Prime");
        }
        for(int i = 2 ; i <= n -1 ; i++){
            if(n % i == 0){
                is_prime = false;
                break;
            }
        }
        if(is_prime == true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }

}*/

//Primes From 1 - 100
/*public class loops {
    public static void main(String[] args) {

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}*/


//Counting Prime Numbers Till 1 to n
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for( int num = 2 ; num<=n ; num++ ){
            boolean is_prime = true;
            for(int Num = 2 ; Num<=num - 1 ; Num++){
                if(num % Num == 0 ){
                    is_prime = false ; 
                    break;
                }
            
            }
            if(is_prime == true){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}*/
