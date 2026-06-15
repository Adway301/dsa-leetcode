    // Two Sum II - Input Array Is Sorted

    import java.util.Arrays;

    public class TwoSumII {
        public static void main(String[] args){
            int[] nums={-1,0};
            System.out.println(Arrays.toString(fun(nums, -1)));
        }
        public static int[] fun(int[] nums,int target){
            int i=0;
            int j=nums.length-1;
            while (i<j) {
                if (nums[i]+nums[j]>target) {
                    j--;
                }
                else if (nums[i]+nums[j]<target) {
                    i++;
                }
                else{
                    return new int[]{i+1,j+1};
                }
            }
            return new int[]{-1,-1};
        }
    }
