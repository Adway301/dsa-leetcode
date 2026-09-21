//523. Continuous Subarray Sum


package Prefix_sum;

import java.util.HashMap;
import java.util.Map;

public class ContiSumSubarray {
    public static void main(String[] args) {
        int[] nums={10,5,2,6};
        int k=6;
        boolean res= numSubarrayProductLessThanK(nums,k);
        System.out.println(res);
    }
    public static boolean numSubarrayProductLessThanK(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,0);
        for (int i = 0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if (m.containsKey(rem)){
                if ((i+1)-m.get(rem)>=2){
                    return true;
                }
            } else {
                m.put(rem,i+1);
            }
        }
        return false;
    }
}
