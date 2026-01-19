/*public class binary{
    public static void binTodec(int binNum){
        int dec = 0;
        int pow = 0;
        while(binNum > 0){
            int ld = binNum%10;
            dec = dec + (ld*(int)Math.pow(2 , pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        int x = 101;
        binTodec(x);
        
    }*/

public class binary{
    public static void binTodec(int binNum){
        int pow = 0 ;
        int dec = 0;
        while(binNum>0){
            int ld = binNum % 10;
            dec = dec + (ld*(int)Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println(dec);
    }
    public static void main(String[] args){
        int x = 1010;
        binTodec(x);

    }
}
