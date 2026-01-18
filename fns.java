/*public class fns{
    public static int sum(int a , int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(1 , 2));
        System.out.println(sum(1.6f, 5.6f));

    }
}*/

//Checking if a number is prime or not
/*public class fns{
    public static boolean isprime(int n){
        boolean prime = true;
        for(int i = 2 ; i<=n-1 ; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        return prime;

    }
    public static void main(String args[]){
        System.out.print(isprime(7));
        

    }
}*/

//optimized
/*public class fns{
    public static boolean isprime(int n){
        boolean prime = true;
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        return prime;

    }
    public static void main(String args[]){
        System.out.print(isprime(7));
        

    }
}*/
//Primes In Range
/*public class fns{
    public static void range(int n){
        for(int i =2 ; i<=n ; i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static boolean isprime(int n){
        boolean prime = true;
        for(int i = 2 ; i<=Math.sqrt(n) ; i++){
            if(n%i == 0){
                prime = false;
                break;
            }
        }
        return prime;

    }
    public static void main(String args[]){
        range(21);
        

    }
}*/
