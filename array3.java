//Binary Search Algorithm
/*public class array3{
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length - 1;
        while(start<=end){
            int mid = (start+end) / 2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1 , 2 , 3 , 4 , 5 , 6 , 7};
        int key = 5;
        int index = binarySearch(numbers, key);
        System.out.println("The Index Of The Key Is " + index);
    }
}*/

//Second Largest In The Array
import java.util.*;
/*public class array3{
    public static int secondLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] < largest && numbers[i] > secondlargest){
                secondlargest = numbers[i];
            }
        }
        return secondlargest;


    }
    public static void main(String[] args) {
        int numbers[] = { 10 , 9 , 8 , 7};
        int sl = secondLargest(numbers);
        System.out.println(sl);
        
    }
}*/

//Checking Whether The Array Is Sorted or not
/*public class array3{
    public static  boolean sorted(int numbers[]){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] > numbers[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println(sorted(marks));
    }
}*/
public class array3{
    public static int maxsubarray(int numbers[]){
        int max_sum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i<numbers.length ; i++){
            int current_sum = 0;
            for(int j = i; j<numbers.length ; j++){
                current_sum+=numbers[j];
                if(current_sum>max_sum){
                    max_sum = current_sum;
                }
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int numbers[] = {1 , 2 , 6 , 1 , 3};
        System.out.println(maxsubarray(numbers));
    }
        
    }

