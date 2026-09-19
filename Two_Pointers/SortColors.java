import java.util.Arrays;

public class SortColors {
    public static void main(String [] args){
        int[] nums = {2,0,2,1,1,0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums){
        int i = 0;
        int j = nums.length-1;
        int k=0;
        
        while (k<j) {
            if (nums[k]==2) {
                int temp = nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                j--;
            }else if (nums[k]==1) {
                k++;
            }else if (nums[k]==0) {
                int temp = nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                i++;k++;
            } 
        }
    }
}
