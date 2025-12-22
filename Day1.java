/*public class Day1{
    public static void main(String args[]){
        System.out.print("1 , 2 , 3 , 4 , 5");
    }
}*/

//Next Line
/*public class Day1{
    public static void main(String args[]){
        System.out.println("Hi"); \n --- works after string
        System.out.println("Hello");
    }
}*/

/*public class Day1{
    public static void main(String args[]){
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

    }*/

/*public class Day1{
    public static void main(String args[]){
        System.out.print("**** \n*** \n** \n* ");
        
    }*/

//variable and datatypes
/*public class Day1{
    public static void main(String args[]){
        int a = 10; 
        int b = 15;
        String Name = "Hi";
        
        

    }
}*/

//8 - PRIMITIVE DATA TYPES
/*public class Day1{
    public static void main(String args[]){
        byte a = 9;
        short b = 12;
        int c = 240;
        float d = 9.8f;
        long e = 1234567890;
        double f = 9.7;
        boolean var = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(var);


    }
}*/
/*public class Day1{
    public static void main(String args[]){
        byte a = 9;
        short b = 12;
        int c = 240;
        float d = 9.8f;
        long e = 1234567890;
        double f = 9.7;
        boolean var = true;
        System.out.println("a=" + a  + " b=" + b + " c=" + c + " d=" + d + " e=" + e);

    }
}*/

//sum using java
/*public class Day1{
    public static void main(String args[]){
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.print(sum);
    }
}*/

/*public class Day1{
    public static void main(String args[]){
        int a = 10;
        double b = 9.6;
        boolean var = true;
        System.out.print("a = "+a+"\n"+"b = "+b+"\n");
    }
}*/

//Input In Java
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(num);

    }
}*/
//sum of a and b using input
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);


    }
}*/

//Product Of a & b
/*import java.util.*;
public class Day1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number");
        int a = sc.nextInt();
        System.out.print("Enter Second Number");
        int b = sc.nextInt();
        int product = a * b;
        System.out.print(product);

    }

    
}*/

//Area Of Circle
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius ; 
        System.out.println(area);

    }
}*/
//Type Casting
/*public class Day1{
    public static void main(String args[]){
        float a = 25.999f;
        int b = (int) a;
        System.out.print(b);
    }
}*/

//Type Promotion In expressions
//Java Converts characters to numbers while doing an expression
/*public class Day1{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.print(a - b); //Answer Is -1 bcoz the java converts chars i to int before evealuating the expression
    }
}*/

/*public class Day1{
    public static void main(String args[]){
        byte a = 5;
        byte n =  (byte) (a * 2);
        System.out.println(n);
    }
}*/

//Problems - APNA CLG
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a + b + c) / 3f;
        System.out.println(avg);


    }
}*/

/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.print(area);
    }
}*/

/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float Eraser = sc.nextFloat();
        float price = (pencil + pen + Eraser);
        float final_price = price + (18/100f) * price;
        System.out.print(final_price);
    

    }
}*/

/*public class Day1{
    public static void main(String args[]){
        int$=24; //error


}
}*/

/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}*/
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int difference = a - b;
        System.out.println(difference);
    }
}*/
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}*/
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float avg = (a + b) / 2f;
        System.out.println(avg);
    }
}*/
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n * n;
        System.out.print(sqr);

    }
}*/

/*import java.util.*;
class area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float area = length * breadth;
        System.out.println(area);
    }
}*/
/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int science = sc.nextInt();
        int social = sc.nextInt();
        int physical_education = sc.nextInt();
        int cs = sc.nextInt();
        float percentage = (math + science + social + physical_education + cs)/500f * 100;
        System.out.println(percentage);

    }
}*/

/*public class Day1{
    public static void main(String args[]){
        System.out.print("Java \nis\neasy");
    }
}*/

/*public class Day1{
    public static void main(String args[]){
        System.out.print("***** \n*****\n*****");
    }
}*/

/*import java.util.*;
public class Day1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.print("My Name is "+ name +"and i am "+ age +"years old");
    }
}*/


















    




