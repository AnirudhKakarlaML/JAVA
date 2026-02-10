//Primes In range
/*public class s1{
    public static boolean isPrime(int n){
        boolean prime = true;
        if(n == 1){
            System.out.println("Neither Prime Nor Composite");
        }
        for(int i = 2 ; i<n ; i++){
            if(n % i == 0){
                prime = false;
            }}
            return prime;}
     public static void PrimeRange(int n){
        for(int i = 2 ; i<=n ; i++){
             if(isPrime(i)){
                 System.out.println(i);
             }
        }
    }
    public static void main(String args[]){
        PrimeRange(8);
    }*/

//Method to caluculate avg three numbers
/*public class s1{
    public static double average(double a , double b , double c){
        double avg = (a + b + c)/3;
        return avg;
    }
    public static void main(String args[]){
        double x = 1 ; 
        double y = 1;
        double z = 2;
        System.out.println(average(x, y, z));


    }
}*/

/*public class s1{
    public static  boolean isEven(int n){
        boolean even = false;
        if(n % 2 == 0){
            even = true;
        }
        return even;
    }
    public static void main(String args[]){
        System.out.println(isEven(9));

    }
}*/

//Function to check whether is a palindrome or not
/*public class s2{
    public static void palindrome(int n){
        int ld;
        int temp = n;
        int rev = 0;
        while(n>0){
            ld = n % 10;
            rev = rev*10+ld;
            n = n/10;
        }
        if(rev == temp){
            System.out.print("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    public static void main(String args[]){
        palindrome(121);
    }
}*/

//Function To Create Sum Of Numbers In An Integer
/*public class s2{
    public static int Sum(int n){
        int ld;
        int sum = 0;
        while(n>0){
            ld = n % 10;
            sum+=ld;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        System.out.println(Sum(121));
    }
}/* */