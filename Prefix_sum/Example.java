package Prefix_sum;
//560. Subarray Sum Equals K

//package patterns.Prefix_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        List<Integer> arr=List.of(1,1,1);
        int k = 2;
        int res = presum(arr,k);
        System.out.println(res);

    }
    public static int presum(List<Integer> arr, int k){
        Map<Long, Integer> psum = new HashMap<>();
        long currsum = 0;
        int count = 0;
        psum.put(0L,1);
        for (int i = 0;i<arr.size();i++){
            currsum+= arr.get(i);
            long target= currsum-k;
            if (psum.containsKey(target)){
                count=count+psum.get(target);
            }
            psum.put(currsum,psum.getOrDefault(currsum,0)+1);
        }
        return count;
    }
}
