/*import java.util.*;//Counting Greater Than 5
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int count = 0;
        while(n > 0){
            ld = n % 10;
            if(ld > 5){
                count+=1;
            }
            n = n / 10;

        }
        System.out.println(count);
        sc.close();
    }

}*/

//Perfect Number Check
/*import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n-1 ; i++){
            if(n % i == 0){
                sum+=i;
            }

        }
        if(sum == n){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
        sc.close();

    }
}*/

//First And Second MAX
/*import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int second_max = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld>max){
                max = ld;
            }
            else if(ld>second_max && second_max<max){
                second_max = ld;
            }
            n = n /10;
        }
        if(max != second_max){
            System.out.println(max);
            System.out.println(second_max);
        }
        else if(max == second_max){
            System.out.println("-1");

        }


    }

}*/

//Checking Whether There Is 7
import java.util.*;
public class loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        boolean found = false;
        while(n > 0){
            ld = n % 10;
            if(ld == 7){
                found = true;
                break;
            }
            n = n /10;
        }
        if(found == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}