import java.util.*;
public class s9{
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1 ; i<=n ; i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean isStrong(int n){
        int ld=0;
        int sum=0;
        int temp = n;
        while(n>0){
            ld = n % 10;
            sum+=factorial(ld);
            n = n / 10;
        }
        if(sum == temp){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStrong(n));
        sc.close();
        
    }
}
