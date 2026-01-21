public class swap {
    public static void adjaa(int arr[]){
       
        for(int i=0;i<arr.length-1;i+=2){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
            
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
          int arr[]={1,2,3,4,5,6};
          for(int x:arr){
            System.out.print(x+" ");
          }
    adjaa(arr);
   for(int x: arr){
    System.out.print(x+" ");
   }
    
}
}
