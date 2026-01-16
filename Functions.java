/*public class f{
    public static void print(){
        System.out.println("Hello World");
    }
    public static void main(String args[]){
        print();

        
    }

}*/

//Syntax With Parameters
/*public class Functions{
    public static int sum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        int a = 10 ;
        int b =15;
        System.out.println(sum(a , b));

    }
}*/

//Product Of A and b using functions
/*import java.util.*;
public class Functions{
    public static int multiply(int a , int b){
        int product = a * b ; 
        return product;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.err.println(multiply(a , b));

    }

}*/

//Factorial using function
/*public class Functions{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;

    }
    public static void main(String args[]){
        int a = 6;
        System.out.print(factorial(a));

    }
}*/

//Binomial Coefficient
/*public class Functions{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact = fact * i;
        }
        return fact;}
    public static int bincoeff(int n , int r){
        int fact_n = factorial(n);
       int  fact_r = factorial(r);
        int fact_x = factorial(n-r);
        int Binomial = fact_n/fact_r*fact_x;
        return Binomial;

    }

    
    public static void main(String args[]){
        int a = 6;
        int b =2;
        System.out.print(bincoeff(a , b));

    }
}*/

