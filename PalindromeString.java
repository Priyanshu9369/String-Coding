public class PalindromeString{
    public static boolean isPalindrome(String str){
        int i;
        int j;
        for(i=0,j=str.length()-1;i<j;i++,j--){
            int left=str.charAt(i);
            int right=str.charAt(j);
            if (left!=right) 
                break;
        }

        if (i<j) 
            return false;
        return true;
        
        
        
        
        
        }
        
    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("naman"));
        System.out.println(isPalindrome("priyanshu"));

    }
}