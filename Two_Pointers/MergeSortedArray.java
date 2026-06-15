import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] num1 = { 0 };
        int[] num2 = { 1 };
        merge(num1, 0, num2, 1);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] num1, int m, int[] num2, int n) {
        // m=num1.length-1;
        // n=num2.length-1;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
                k--;
            } else {
                num1[k] = num2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
}
