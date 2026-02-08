/*public class revise{
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}*/

/*public class revise{
    public static void main(String args[]){
        System.out.println("Hi");
         System.out.println("Hi");
    }
}*/

/*public class revise{
    public static void main(String args[]){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}*/

//Variable
/*public class revise{
    public static void main(String args[]){
        String name = "Tony";
        int age = 48;
        double price = 25.25;
        int a = 25;
        int b = 10;
        int sum = a + b;
        //System.out.println(sum);
        int diff = b -a;
        System.out.println(diff);
    }
}*/

//Input
/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }
}*/

//Using Scanner
/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);}
}*/

//Conditional Statements
/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}*/

/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}*/

/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Equal");}
        else if(a > b){
            System.out.println("a greater");
        }
        else{
            System.out.println("b greater");
        }
        
        }
    
}*/

//Switch Case Statement
/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3 :System.out.println("Bonjour");
            break;
            default:System.out.println("Inavlid Input");
        }
    }
}*/

//LOOPS
/*public class revise{
    public static void main(String args[]){
        for(int counter = 0 ; counter < 100 ; counter++){
            System.out.println("hlo");
        }
    }
}*/

/*public class revise{
    public static void main(String args[]){
        for(int i = 1 ; i<=100; i++){
            System.out.println(i);
        }

    }
}*/

//while

/*public class revise{
    public static void main(String args[]){
        int i = 0;
        while(i < 11){
            System.out.println(i);
            i++;
        }
    }
}*/

/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i<=n ; i++){
            sum+=i;
        }
        System.err.println(sum);

        }
    }*/

/*import java.util.*;
public class revise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=10 ; i++){
            System.err.println(n*i);
        }
    }
}*/

//Functions
/*import java.util.*;
public static void PrintMyName(String Name){
    System.out.println(Name);
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    PrintMyName(name);
}*/

//Functuion Of sum
/*public class revise{
    public static int sum(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int sum = sum(x, y);
        System.err.println(sum);
    }
}*/

//Function To Factorial
/*import java.util.*;
public class revise{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i <= n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));
    }
}*/



