// 2824. Count Pairs Whose Sum is Less than Target

import java.util.Arrays;

public class CountPairsWhoseSumisLessthanTarget {
    public static void main(String[] args){
        int[] nums= {-6,2,5,-2,-7,-1,3};
        System.out.println((fun(nums, -2)));;
    }

    public static int fun(int[] nums, int target){
        int i =0 ;
        Arrays.sort(nums);
        int j= nums.length-1;
        int count=0;
        int n=nums.length;
        while (i<j) {
            if ((i < j ) && nums[i]+nums[j]<target) {
                count=count+(j-i);
                i++;
            }else{
            j--;
            }
        }
        return count;
    }
}
