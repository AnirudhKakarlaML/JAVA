/*import java.util.*;
public class c1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        boolean isPrime = true;
        n = sc.nextInt();
        if(n == 1){
            System.out.println("Not Prime");
        }
        for(int i = 2 ; i<n ; i++){
            if(n%i == 0){
                isPrime = false;
            
        }}
        if(isPrime == true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}*/

//Printing Primes From 1-n
/*import java.util.*;
public class c1{
    public static boolean primeCheck(int n){
        boolean Isprime = true;
        if(n == 1){
            System.out.println("Not Prime");
        }
        for(int i = 2 ; i<=(int)Math.sqrt(n) ; i++){
            if(n%i == 0){
                Isprime = false;
            }
        }
        return Isprime;
        }
    public static void primePrint(int n){
        for(int i = 1 ; i<=n;i++){
            if(primeCheck(i)==true){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        primePrint(11);
    }
}*/

/* 
public class c1{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i<= n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}*/

import java.util.Scanner;

public class c1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pow = 0;
        int n;
        n = sc.nextInt();
        int temp = n;
        int check = n;
        int sum = 0;
        while(n>0){
            int ld = n % 10;
            pow++;
            n = n / 10;
        }
        while(temp >0){
            int xd = temp % 10;
            sum+=(int)Math.pow(xd , pow);
            temp = temp / 10;
        }
        if(sum == check){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Non Armstrong Number");
        }


    }
}