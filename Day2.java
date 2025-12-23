//operator---arithmetic
/*public class day2{
    public static void main(String args[]){
        int a = 10;
        int b = 10;
        System.out.println("Sum = " + (a+b));
        System.out.println("Difference =" + (a - b));
        System.out.println("product = " + (a*b));
        System.out.println("quotient = " + (a/b));
        System.out.println("Remainder = " + (a%b));

    }
    
}*/

/*public class day2{
    public static void main(String args[]){
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

    }
}*/

//Logical Operators
/*public class day2{
    public static void main(String args[]){
        System.out.println((3>2) && (2>3));
        System.out.println((3>2) || (2>3));
        System.out.println(!(3>2));

    }
}*/

//Assignment Operators
/*public class day2{
    public static void main(String args[]){
        int a = 10;
        a+=10;
        System.out.println(a);
        int b = 15;
        b-=15;
        System.out.println(b);
        int c=22;
        c*=2;
        System.out.println(c);
    }
}*/
/*import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age :- ");
        int age = sc.nextInt();
        if(age >= 18){
        System.out.println("Adult");}
        else {
            System.out.println("Minor");

        }

    }
}*/

//Largest Of two numbers
/*public class day2{
    public static void main(String args[]){
        int A = 1 ;
        int B = 3 ;
        if(A > B){
            System.out.println("A is Greater Than B");
        }
        else{
            System.out.println("B is greater than A");
        }

    }
}*/
/*import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Be Checked :-");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("The Number Is Even");
        }
        else{
            System.out.println("The Number Is odd");
        }


    }
}*/

//Income Tax Caluculator
/*import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        float tax;
        if(income < 500000){
             tax = 0;
        }
        else if(income>=500000 && income<=1000000 ){
            tax = (20/100f) * income;}
        else{
             tax = (30/100f) * income;
        }
        System.out.println(tax);
        }

    }*/

//Largest Of 3 numbers
/*public class day2{
    public static void main(String args[]){
        int a = 2 ;
        int b = 3;
        int c =4;
        if(a>=b && a>=c){
            System.out.println("a is greatest");
        }
        else if (b>=a && b >=c){
            System.out.println("b is greatest");}
        else{
            System.out.println("C IS GREATEST");
        }
        
    }
}*/

//Terenary Operator
/*public class day2{
    public static void main(String args[]){
        int a = 4;
        String type = ((a % 2 == 0))?"Even":"odd";
        System.out.println(type);
    }
}*/

//Switch Statements + Calc
/*public class day2{
    public static void main(String args[]){
        int number = 2;
        switch(number){
            case 1 : System.out.println("Hi");
            case 2 : System.out.println("Bye");
            default : System.out.println("no hi")
        }

    }
}*/

//caluculator
/*import java.util.*;
public class day2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);//+ , - , * , /
        switch (operator) {
            case '+':
                System.out.println((a + b));
                break;
            case '-':
                System.out.println((a - b));
                break;
            case '*':
                System.out.println((a * b));
                break;
            case '/':
                System.out.println((a / b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}*/

/*import java.util.*;
public class Positive_Negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a > 0){
            System.out.print("Posiitive");
        }
        else if (a < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }

    }

}*/

/*import java.util.*;
public class Fever_check{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        String Fever = ((temperature > 37.5))?"Fever":"Normal";
        System.out.println(Fever);

    }
}*/

/*import java.util.*;
public class day{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();//Choose From 1 - 7
        switch(choice){
            case 1 : System.out.println("Monday");break;
            case 2 : System.out.println("Tuesday"); break;
            case 3 : System.out.println("Wednesday");break;
            case 4 : System.out.println("Thursday");break;
            case 5 : System.out.println("Friday");break;
            case 6 : System.out.println("Saturday");break;
            case 7 : System.out.println("Sunday");break;
            default:
                System.out.println("Enter Valid Input");

        }


    }
}*/

//Leap Year Check
/*import java.util.*;
public class LeapYearCheck{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not Leap Year");
        }
        sc.close();

    }
}*/




