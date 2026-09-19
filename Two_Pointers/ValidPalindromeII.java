// 680 valid palindrome 2nd

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s ="acbdba";
        System.out.println(fun(s));
    }
    public static boolean fun(String s ){
        int i=0;
        int j=s.length()-1;
        while (i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
            //make a helper function 
            if (ispalin(i+1, j, s) || ispalin(i, j-1, s ) ) {
                return true;
            }
            return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean ispalin(int i,int j,String s){
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}
