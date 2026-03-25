//Printing All DIvisors Of A Number
/*import java.util.*;
public class s7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please Enter The Number:-");
        n = sc.nextInt();
        for(int i =1 ; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        sc.close();

        
    }
}*/

/*import java.util.*;
public class s7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please Enter The Number:-");
        n = sc.nextInt();
        int count = 0;
        for(int i =1 ; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        sc.close();

        
    }//Question Was To Do This In a function
}*/

/*import java.util.*;
public class s7{
    public static int sumOfDivisors(int n){
       int  sum = 0;
        for(int i = 1 ; i<=n ; i++){
            if(n%i == 0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(sumOfDivisors(n));
        sc.close();
    }
}*/
import java.util.*; 
/*public class s7{
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            if( n%i == 0){
                sum+=i;
            }
        }
        if(sum == n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isPerfect(n));


        
    }
}*/

public class s7{
    public static int Gcd(int n1 , int n2){
        int gcd=0;
        for(int i = 1 ; i<=n1 && i<=n2 ; i++){
            if(n1%i == 0 && n2%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        System.out.println(Gcd(number1, number2));
        sc.close();
    }
}