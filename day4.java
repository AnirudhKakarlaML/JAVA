/*public class loops {
    public static void main(String args[]){
        for(int i = 1 ; i<=50 ; i++){
            System.out.println(i);
        }
    }
    //Printing 1 to 50 numbers
}*/

//Reverse Order Printing

/*public class loops{
    public static void main(String args[]){
        for(int i = 50 ; i>=1 ; i--){
            System.out.println(i);
        }
    }
}*/

//Printing Even Numbers From 1 - 100
/*public class loops{
    public static void main(String args[]){
        for(int i = 1 ; i <= 100 ; i ++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}*/

//Printing Odd numbers from 1 - n
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1 ; i<=n ; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}*/

//Sum Of Number From 1 - N
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum += i;
        }
        System.out.println(sum);
        sc.close();

    }
}*/

//counting digits of a number
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = 0 ;
        int count = 0;
        while(n > 0){
            ld = n % 10;
            count += 1;
            n/=10;    
        }
        System.out.println(count);
    }
}*/

//Printing Last Digit Of Number
/*import java.util.*;
public class loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = n % 10;
        System.out.println(ld);
        sc.close();


    }
}*/

//SQUARE STAR PATTERN
/*public class loops{
    public static void main(String args[]){
        for(int i = 1 ; i<=4 ; i++){
            for(int j = i ; j<=i ; j++){
                System.err.println("*");
            }
        }
    }
}*/
/*import java.util.*;

public class loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // size of square

        // OUTER LOOP → rows
        for (int i = 1; i <= n; i++) {

            // INNER LOOP → columns
            for (int j = 1; j <= n; j++) {

                // print ONE star (no new line)
                System.out.print("*");
            }

            // move to next line AFTER inner loop
            System.out.println();
        }

        sc.close();
    }
}*/

/*public class loops{
    public static void main(String args[]){
        for (int i = 1 ; i<=5 ; i++){
            System.out.print("*");
        }
    }
}*/

/*public class loops{
    public static void main(String args[]){
        for(int i = 1; i<=5 ; i++){
            System.out.print("*");
            
        }
        System.err.println();
        for(int j = 1 ; j<=5 ; j++){
            System.out.print("*");


        }
    }
}*/

/*public class loops{
    public static void main(String args[]){
        for(int i = 1 ;  i <=4 ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}*/

/*public class loops{
    public static void main(String args[]){
        for(int i = 1 ; i<=4 ; i++){
            for (int j =4; j>=i ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/





        

        
        

