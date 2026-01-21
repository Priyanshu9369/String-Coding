public class CheckPangram {
    // Given a string check if it is pangram or not. A pangram is a sentence
    // containing every letter in the english alphabet.
    //example:"Yhe quick brown fox jumps over the lazy dog".
    // this a example of pangram -- there is a 26 letter and containing all the alphabets
    public static boolean checkpangram(String str){
        boolean result[] = new boolean[26];
        for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if (Character.isAlphabetic(ch)) {
            ch=Character.toUpperCase(ch);
            int index=ch-'A';
            result[index]=true;
        }
    }
        for(boolean x:result){
            if (x==false) 
                return false;
            
        }
        return true;
        

    }
    public static void main(String[] args) {
       System.out.println( checkpangram("The quick brown fox jumps over the lazy dog"));
    }
}
