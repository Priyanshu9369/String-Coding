public class PrintSubStrings {
    // example1-; abc-; a,ab,abc,b,bc,c this is substring of abc
    public static void showsubstring(String str){
        int length= str.length();
        // outer loop 
        int count=0;
        for(int i=0;i<length;i++){
            // inner loop 
        
            for(int j=i;j<length;j++){
            
                System.out.println(str.substring(i, j+1));
                count++;
            }
           
        }
        System.out.println("Total sunstring is ="+count);
        
    }
    public static void showsubstring2(String str){
        int length = str.length();
        for(int i=0;i<length;i++){
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<length;j++){
                System.out.println(sb.append(str.charAt(j)));
            }
        }
    }
    public static void main(String[] args) {
        showsubstring2("abc");
    }
}
