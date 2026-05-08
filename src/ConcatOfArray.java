package src; // Solution to concat of array : https://leetcode.com/problems/concatenation-of-array/
import java.util.Scanner;

class Solution_array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}

public class ConcatOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scan.nextInt();
        int[] nums = new int[n];

        System.out.print("Enter elements with space: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        Solution_array sol = new Solution_array();
        int[] result = sol.getConcatenation(nums);

        System.out.print("Output: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
        System.out.println();
        scan.close();
    }
}