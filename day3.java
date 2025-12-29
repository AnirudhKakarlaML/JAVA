/*public class loops{
    public static void main(String args[]){
        int counter = 0;
        while(counter < 100){
            System.out.println("Hello World");
            counter++;
        }
    }
 
}*/

/*public class loops{
    public static void main(String args[]){
        int counter = 1;
        while(counter <= 10){
            System.out.println(counter);
            counter++;
        }
    }
}*/

/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n ){
            System.out.println(counter);
            counter++;
        }
    }
    
}*/

//Sum of first n natural numbers
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i =1;
        int sum = 0;
        int n = sc.nextInt();
        while(i <= n){
            sum += i ;
            i++;

        }
        System.out.println(sum);
    }
}*/

//For loop
/*public class loops{
    public static void main(String args[]){
        for(int i = 1; i <= 10 ; i++){
            System.out.println("Hello World");
        }

    }
}*/

/*public class loops{
    public static void main(String args[]){
        for(int i = 1 ; i <= 4 ; i++){
            System.out.println("****");

        }
        
    }
}*/
//Reverse of a number
/*public class loops{
    public static void main(String args[]){
        int n = 12345;
        int ld;
        int rev = 0;
        while(n > 0){
            ld = n % 10;
            rev = rev * 10 +ld;
            n = n / 10;
        }
        System.out.println(rev);
   }
}*/

//Do - While loop
/*public class loops{
    public static void main(String args[]){
        int count = 1;
        do{
            System.out.println("Hello World");
            count++;
        }while(count<=10);

    }
}*/

//Q- keep taking inputs until its a multiple of 10
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter A Number :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
        }while(true);
    }
}*/

/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.err.println("Enter Your Number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.err.println(n);
            
        }while(true);
    }
}*/

/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean is_prime = true;
        int n = sc.nextInt();
        for(int i = 2 ; i<=n-1 ; i++){
            if(n % i == 0){
                is_prime = false;
            }
        }
        if(is_prime == true){
            System.out.println("Prime");
        }
    else{
            System.out.print("Not Prime");
        }


        
    }
}*/



