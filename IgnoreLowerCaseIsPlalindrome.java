public class IgnoreLowerCaseIsPlalindrome {
    public static boolean isPalindrome(String s){
        int i,j;
        int str=s.length();
        for(i=0,j=str-1;i<j;i++,j--){
            // skip non-alphanumaric charcter from left
            while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            // skip non-alphanumeric character from right
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            // string have Uppercase so change into lowercase
            char left=Character.toLowerCase(s.charAt(i));
            char right= Character.toLowerCase(s.charAt(j));
            // check character left is equal to right or not 
            if (left!=right) 
                return false;
        }
        if (i<j) 
            return false;
        return true;
            
        
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
         System.out.println(isPalindrome("race a car"));
          System.out.println(isPalindrome(" "));
    }
}
