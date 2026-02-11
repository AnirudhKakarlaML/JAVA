/*public class p1 {
    public static void binTodec(int BinNum){ // Binary To Decimal-->Code
        int temp = BinNum;
        int pow = 0;
        int ld = 0;
        int dec =0;
        while(BinNum>0){
            ld = BinNum % 10;
            dec = dec + (ld*(int)Math.pow(2 , pow));
            pow++;
            BinNum = BinNum / 10;
        }
        System.out.println("The Decimal Number Is"+dec);
    }
    public static void main(String args[]){
        binTodec(1100);
    }
    
}*/

//Dec to Binary
/*public class p1{
    public static void decTobin(int Dec){
        int pow = 0;
        int rem;
        int bin = 0;
        while(Dec > 0){
            rem = Dec % 2;
            bin = bin+(rem*(int)Math.pow(10 , pow));
            pow++;
            Dec = Dec/2;

        }
        System.out.println("The Binary For Given Dec Is"+bin);

    }
    public static void main(String args[]){
        decTobin(8);
    }
}*/

//PRACTICE OF FUNCTIONSN BEFORE TRANSITIONS TO ARRAYS
//Function to return a square of a number
/*public class p1{
    public static int sq(int n){
        return (int)Math.pow(n , 2);
    }
    public static void main(String args[]){
        System.out.println(sq(9));


    }
}*/

/*public class p1{
    public static int cu(int n){
        return (int)Math.pow(n , 3);
    }
    public static void main(String args[]){
        System.out.println(cu(9));
    }
}*/

/*public class p1{
    public static int maxOftwo(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b ;
        }
       
    }
    public static void main(String[] args) {
        maxOftwo(7 , 8);
    }
}*/

/*public class p1{
    public static int minOfThree(int a , int b , int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<a && b<c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args) {
        System.out.println(minOfThree(8 , 9 , 10));
    }
}*/

/*public class p1{
    public static boolean oddOrEven(int n){
        boolean iseven = false;
        if(n % 2 == 0){
            return true;
        }
        return iseven;
    }
    public static void main(String args[]){
        System.out.println(oddOrEven(8));
    }
}*/
/*public class p1{
    public static boolean isPrime(int n){
        boolean Prime = true;
        if(n == 1){
            System.out.println("Neither Prime Nor Composite");
        }
        for(int i = 2 ; i<n ; i++){
            if(n % i == 0){
                Prime = false;
            }
        }
        return Prime;
    }
    public static void main(String args[]){
        System.out.println(isPrime(7));
    }
}*/

public class p1{
    public static int Factorial(int n){
        int fact = 1; 
        if(n <0){
            return -1;
        }
        for(int i = 1; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        System.out.println(Factorial(5));
    }
}
