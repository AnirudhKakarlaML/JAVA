/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //Counting No Of Fives
        int count = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld == 5){
                count = count + 1 ;
            }
            n = n / 10;

        }
        System.out.println(count);
        sc.close();
        
    }
}*/

//Sum Of Even Digits
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n > 0){
            int ld = n % 10;
            if(ld % 2 == 0){
                sum+=ld;
            }
            n = n /10;
        }
        System.out.println(sum);
        sc.close();
    }
}*/

//Checking Whether Number Contains Digit 9
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean found = false;
        int ld;
        while(n > 0 ){
            ld = n % 10;
            if(ld == 9){
                found = true;
                break;
            }
            n = n / 10;
        }
        if(found == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}*/

//Tracking Max Value
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int ld;
        while(n > 0){
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

// Count Digits Divisible By 3
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int digit;
        while(n > 0){
            digit = n % 10;
            if(digit % 3 == 0){
                count+=1;
            }
            n = n /10;
        }
        System.out.println(count);
        sc.close();


    }
}*/

//Counting Odd Digits
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int count = 0;
        while(n > 0){
            ld = n % 10;
            if(ld % 2 != 0){
                count += 1;
            }
            n = n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}*/

//Sum Of Digits Greater Than 5
/*import java.util.*;
public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int ld;
        while(n > 0){
            ld = n % 10;
            if(ld > 5){
            sum+=ld;}
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}*/

//Counting How Many Times MAx Appears In The Number
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int max = 0;
        int ld;//2 loops used and countend traversal used
        int digit;
        int count = 0;
        while(n > 0){
            ld = n % 10;
            if(ld > max){
                max = ld;
            }
            n = n / 10;
        }
        while(temp > 0){
            digit = temp % 10;
            if(digit == max){
                count+=1;
            }
            temp = temp / 10;
        }
        System.out.println(count);
        sc.close();

    }
}*/

//Reverse Of A Nmber
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int ld;
        while(n > 0){
            ld  = n % 10;
            rev = rev*10+ld;
            n = n / 10;
        }
        System.out.println(rev);
        sc.close();

    }
}*/

//Palindrome Check
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int ld;
        int temp = n;
        while(n > 0){
            ld  = n % 10;
            rev = rev*10+ld;
            n = n / 10;
        }
        System.out.println(rev);
        if(rev == temp){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();

    }
}*/

//counting no.of digits
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            int ld = n % 10;
            count+=1;
            n = n /10;
        }
        System.out.println(count);
        sc.close();
    }
}*/

//Sum Of First And Last Digit
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld = 0;
        int d = n % 10;
        while(n > 0){
            ld = n % 10;
            n = n / 10;
        }
        System.out.println( ld + d);
        sc.close();
        

    }
}*/
// Removing All Zeroes From The Number
// 2reverse
/*import java.util.*;
public class practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int rev_2 = 0;
        while(n > 0){
            int ld = n % 10;
            if(ld != 0){
            rev = rev * 10 +ld;}
            n = n / 10;
        }
        while(rev  > 0){
            int digit = rev % 10;
            rev_2 = rev_2 * 10 + digit;
            rev = rev / 10;
        }
        System.out.println(rev_2);
        sc.close();

    }
}*/

//Sum Of Digits At Even Positions
/*import java.util.*;
public class day9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ld;
        int count = 0;
        int sum = 0;
        while(n > 0){
            ld = n % 10;
            count+=1;
            if(count % 2 == 0){
                sum+=ld;
            }
            n = n / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}*/


