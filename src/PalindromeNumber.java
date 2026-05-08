package src; // Solution for leetcode problem 9 - Palindrome : https://leetcode.com/problems/palindrome-number/
import java.util.Scanner;
import java.lang.String;

class Solution{
    public boolean isPalindrome(int x) {
        if (x<0)
                return false;
        String test = String.valueOf(x);
        int len = test.length();

        int left = 0, right = len-1;
        while(right>left){
            if(test.charAt(left)==test.charAt(right)){
                left++;
                right--;
            }
            else
                return false;
        }
        return true;
    }
}

public class PalindromeNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(x);

        System.out.println(result);
        sc.close();
    }
}
