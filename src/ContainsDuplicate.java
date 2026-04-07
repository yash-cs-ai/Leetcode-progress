package src;//Solution for problem 217 (Easy) - Contains duplicate on leetcode.

import java.util.Arrays;

// Sorting approach - data is sorted before process
public class ContainsDuplicate{
        public static boolean Solution(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;

            for(int i=0;i<n-1;i++){
                if(nums[i]==nums[i+1]){
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        //Using example inputs
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(Solution(nums));
        System.out.println(Solution(nums2));
        System.out.println(Solution(nums3));
    }
}
