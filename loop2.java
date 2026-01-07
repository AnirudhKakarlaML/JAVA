/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int sum = 0;
        while(n > 0){
            ld = n % 10;
            if(ld == 0){
                break;
            }
            sum+=ld;
            n = n/10;
        }
        System.out.println(sum);
        sc.close();
    }
}*/

//count until 7 appears
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld == 7){
                break;
            }
            count+=1;
            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}*/

//Printing The First Even Digit That Appera From Right
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = 0;
        boolean is_found = false;
        while(n > 0){
            ld = n % 10;
            if(ld % 2 == 0){
                 is_found = true;
                 break;
            }
            n = n / 10;
        }
        if(is_found == true){
            System.out.println(ld);
        }
        else if(is_found == false){
            System.out.println("-1");
        }
        sc.close();

    }
}*/

//Counting Trailing Zeroes
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld != 0){
                break;
            }
            count+=1;

            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}*/

//Checking Whether The Number Contains 5
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean is_found = false;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld == 5){
                is_found = true;
                break;
            }
            n = n / 10;
        }
        if(is_found == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        
    }
    sc.close();}
}*/

//Sum of digits until greater than 5 appears
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int sum = 0;
        while(n > 0){
            ld = n % 10;
            sum+=ld;
            if(ld > 5){
                break;
            }
            n = n / 10;
        }
        System.out.print(sum);
        sc.close();
    }
}*/

/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){
            System.out.println(i);
        }
        sc.close();
    }
}*/

//Printing From n--1
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n ; i>=1 ; i--){
            System.out.println(i);
        }
        sc.close();
    }
}*/

//Printing Even Number From 1- n 
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
            System.out.println(i);}
        }
        sc.close();
    }
}*/

//Sum of first n natural number
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}*/

//Right handed triangle
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.err.println();}}}*/

//Inverted Triangle
/*import java.util.*;
public class loop2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}*/

//1223334444
/*public class loop2{
    public static void main(String args[]){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        
    }
}*/



