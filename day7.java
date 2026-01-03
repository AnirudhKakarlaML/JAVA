/*import java.util.*;
public class loops1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int max = 0;
        while( n > 0 ){
            ld = n % 10;
            if(ld > max){
                max = ld;
            }
            n = n / 10;
        
        }
        System.out.println(max);
        sc.close();
        
    }
}*/
/*import java.util.*;
public class loops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int min = n % 10;
        while (n > 0){
            ld = n % 10;
            if(ld < min){
                min = ld;
            }
            n/=10;
        }
        System.out.println(min);
        sc.close();
        
    }
}*/

/*import java.util.*;
public class loops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld % 2 ==0){
                even+=1;
            }
            else{
                odd+=1;
            }
            n = n /10;
        }
        System.out.print("The even count is" + even +"The odd count is" + odd);
        sc.close();
    }
}*/

//Stop Digit Processing When Sum Exceeds 15
/*import java.util.*;
public class loops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            sum+=ld;
            
            if(sum > 15){
                break;
            }
            n = n / 10;
            


        }
        System.out.println(sum);
        sc.close();
       
    }

}*/
/*import java.util.*;

public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;

            if (sum > 15) {
                break;
            }

            n = n / 10;
        }

        System.out.println(sum);
        sc.close();
    }
}*/
//Counting Digits Till 0 appears
/*import java.util.*;
public class loops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            count+=1;
            if(ld == 0){
                break;
            }
            n = n /10;

        }
        System.err.println(count);
        sc.close();;


    }
}*/

//Finding First Non Zero From Right
/*import java.util.*;
public class loops1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        while (n > 0){
            ld = n % 10;
            if(ld!=0){
                System.out.println(ld);
                break;
            }
            n = n / 10;
        }
        sc.close();
    }
}*/


