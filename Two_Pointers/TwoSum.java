//  package patterns.Two_Pointers;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={2,5,5,11};
        // int target;
        System.out.println(Arrays.toString(fun(nums, 10)));
    }

    static int[] fun(int[] nums,int target){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j >i ; j--) {
                int sum=nums[i]+nums[j];
                if (sum==target) {
                    return new int[] {i,j} ;
                }
                // if (sum>target) {
                //     j--;
                // }
                // if (sum<target) {
                //     i++;
                // }
            }
        }
        return new int[]{};
    }
}
