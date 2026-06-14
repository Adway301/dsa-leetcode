public class Palindrome {

    public static void main(String[] args) {
        String s = "a,b,a";
        System.out.println(isPalin(s));
    }
    public static boolean isPalin(String s){
        s=s.toLowerCase().trim();
        s=s.replace(" ","");
        int i = 0;
        int j = s.length()-1;
        while (j>i) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;j--;
        }
        return true;
    }
}