public class CheckPermutation {
    // check str1 is permutation of string 2 or not 
    public static boolean checkpermutation(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int i;
        char x;
        int length=str1.length();
        int [] arr=new int[256];
        for(i=0;i<length;i++){
            x=str1.charAt(i);
            arr[x]++;
            x=str2.charAt(i);
            arr[x]--;
        }
        for(i=0;i<arr.length;i++){
            if (arr[i]!=0) {
                return false;
            }
        }
        return true;
    }
   public static void main(String[] args) {
    System.out.println(checkpermutation("abcd", "cbad"));
    System.out.println(checkpermutation("abcd", "acds"));
    System.out.println(checkpermutation("abcds", "abc"));
   } 
}
