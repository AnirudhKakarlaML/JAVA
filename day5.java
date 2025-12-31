/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int rev = 0;
        while(n > 0){
            ld = n % 10;
            rev = rev*10 + ld;
            n = n / 10;

        }
        System.out.println(rev);
    }
}*/

//Sum of digits
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            sum = sum + ld;
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();


        
    }

}*/

//Product Of Digits
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        int ld;
        while(n > 0){
            ld = n % 10;
            product *= ld;
            n = n /10;
        }
        System.out.println(product);
        sc.close();

    }
}*/

//No.of zeroes
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int count = 0;
        while(n > 0){
            ld = n % 10;
            if(ld == 0){
                count+=1;
            }
            n= n /10;
        }
        System.out.println(count);
        sc.close();


    }
}*/

//Checking of a palindrome number
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        int ld;
        while(n > 0){
            ld = n % 10;
            rev = rev*10+ld;
            n = n / 10;
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        sc.close();
    

    }
}*/

//Multiples till 1 - n
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}*/

//Multiples of 3 count  till 1 - n
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i % 3 == 0){
                count +=1 ;
            }
        }
        System.out.println(count);
        sc.close();
    }
}*/

//Right Angle Triangle Pattern
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.err.println();

        }
    }
}*/

//Half Pyramid Pattern
/*public class loops{
    public static void main(String args[]){
        for(int i = 1; i <=4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/