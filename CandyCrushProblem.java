public class CandyCrushProblem {
    public static void reducestring(String str){
        StringBuffer sb=new StringBuffer(str);
        int i=0;
        while (i<sb.length()-1) {
            char ch1=sb.charAt(i);
            char ch2=sb.charAt(i+1);
            if (ch1==ch2) {
                sb.delete(i,i+2);
                if (i!=0) 
                i--;
                
                continue;
            }
            i++;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        reducestring("google");
    }
}
