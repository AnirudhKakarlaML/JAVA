/*public class array2 {
    //HardCoded Array
    public static void main(String[] args) {
        int marks[] = {1 , 2 , 3 , 4 , 5};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

    }
}*/

import java.util.*;
/*public class array2{
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1]=sc.nextInt();
        System.out.println("Maths Mark"+marks[0]);//Input in Arrays
        System.out.println("SemiConductor Mark"+marks[1]);
    }
}*/

//Length Of An Array
/*public class array2{
    public static void main(String[] args) {
        int marks[]= new int[100];
        System.out.println(marks.length);
    }}*/
    


//Passing Array As An Function Argument
/*public class array2{
    public static void update(int marks[]){
        for(int i = 0 ; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        update(marks);
        for(int i = 0 ; i<marks.length ; i++){
            System.out.println(marks[i]);
            System.out.println();
        }
    }
    
}*/

//Linear Search
/*public class array2{
    public static int linearSearch(int numbers[] , int key){
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2 , 4 , 6 , 8 , 10 , 12 , 14};
        int key = 10;
        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Key Is At Index " + index);
        }
    }
}*/

//Largest In An Array
/*public class array2{
    public static int Largest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<number.length ; i++){
            if(number[i]>largest){
                largest = number[i];
            
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int marks[] = {97 , 98 , 99 , 100};
       int largest = Largest(marks);
       System.out.println(largest);

    }
}*/

//Smallest In Array
/*public class array2{
    public static int smallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i] < Smallest){
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }
    public static void main(String[] args) {
        int marks[ ] = { 98 , 92};
        int smallest = smallest(marks);
        System.out.println(smallest);
    }
    
}*/

//Binary Search Code
/*public class array2{
    public static int binarySearch(int numbers[] , int key){
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2 , 4 , 6 , 8 , 10 , 12 , 14};
        int key = 10;
        int index = binarySearch(numbers, key);
        System.out.println(index);
    }
}*/

//Second Largest Element
public class array2{
    public static int secondLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }
        for(int i = 0 ; i<numbers.length ; i++){
            if(numbers[i]<largest && numbers[i]>smallest){
                smallest = numbers[i];

            }
        }
        return smallest;
        

    }
    public static void main(String[] args) {
        int number [] = {10 , 12 , 14 , 16 };
        System.out.println(secondLargest(number));
    }}



