public class PerformingOperation {
    public static int performingoperation(String[] arr){
        int count=0;
        for(String operation:arr){
            // switch (operation) {
            //     case "X++": case "++X":
            //         count=count+1;
            //         break;
            
            //     default:
            //         count=count-1;
            //         break;
            // }
            if (operation=="X++" || operation=="X--") {
                count=count+1;
            }
            else{
                count=count-1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String [] arr=new String[]{"X++","++X","--X","X--"};
        System.out.println(performingoperation(arr));
    }
}
