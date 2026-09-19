

public class Contain_dupli{
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
        boolean g = containsNearbyDuplicate(nums,k);
        System.out.println(g);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int i =0;
        int j=0;
        int sum=0;
        for(i = 0; i<k; i++){
            sum=sum+nums[i];
        }
        for(i=k;i<nums.length;i++){
            sum+=nums[i];
            sum-=nums[k-i+1];
        }
        return true;
    }
}