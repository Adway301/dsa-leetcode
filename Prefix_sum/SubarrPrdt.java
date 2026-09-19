//713. Subarray Product Less Than K
package Prefix_sum;
public class SubarrPrdt {
    public static void main(String[] args) {

    }
    public int numSubarrayProductLessThanK(int[] nums, int k) {
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