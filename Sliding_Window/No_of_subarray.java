

public class No_of_subarray {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,5,5,5,8};
        int k =3;
        int threshold =4;
        System.out.println(numOfSubarrays(arr, k, threshold));
    }
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        
        int count=0;
        for(int i =0;i<k;i++){
            sum=sum+arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            avg=sum/k;
            if (avg>=threshold) {
                count++;
            }
        }
        return count;
    }
}
