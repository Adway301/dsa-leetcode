// 344 Reverse String

import java.util.Arrays;

public class ReverseString{
    public static void main(String[] args){
        char[] c = {'h','e','l','l','o'};
        fun(c);
        System.out.println(Arrays.toString(c));
    }
    public static void fun(char[] c){
        int i = 0;
        int j = c.length-1;
        while (i<j) {
            char temp = c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
    }
}