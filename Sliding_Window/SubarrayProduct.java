

public class SubarrayProduct {
    static void main() {
        int[] nums = {10,5,2,6};
        int k=100;
        int res = numSubarrayProductLessThanK(nums,k);
        System.out.println(res);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int count =0 ;
        long product=1;
        int i =0;

        for(int j=0;j<nums.length;j++){
            product=product*nums[j];
            while(product>=k && i<=j){
                product/=nums[i];
                i++;
            }
            count+=(j-i+1);
        }
        return count;
    }
}
