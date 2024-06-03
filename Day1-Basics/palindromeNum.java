import java.util.*;
public class palindromeNum {
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int num = x;
        int rev = 0;
        while(x>0){
            int temp = x%10;
            rev = rev*10 + temp;
            x /=10;
        }
        return (rev == num);

    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
        
    }
}