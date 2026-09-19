
import java.util.HashMap;
import java.util.Map;

public class Maximum_sum_of_distinct_subarray {

    public static void main(String[] args) {
        int[] nums = { 1, 5, 4, 2, 9, 9, 9 };
        int k = 3;
        System.out.println(maximumSubarraySum(nums, k));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long max = 0;
        int dup = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
            sum = sum + nums[i];
            if (map.get(nums[i]) > 1) {
                dup++;
            }
        }
        if (dup == 0) {
            max = Math.max(max, sum);
        }
        for (int i = k; i < nums.length; i++) {
            int next = nums[i];
            int rem = nums[i - k];
            if (!map.containsKey(next)) {
                map.put(next, 0);
            }
            map.put(next, map.get(next) + 1);
            if (map.get(next) > 1) {
                dup++;
            }
            sum = sum + next;
            if (map.get(rem) > 1) {
                dup--;
            }
            map.put(rem, map.get(rem) - 1);
            sum -= rem;
            if (dup == 0) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}