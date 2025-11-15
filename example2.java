public class example2 {
    // String CONSTRUCTOR and METHODS
    public static void main(String[] args) {
        
        // 1 -:contructor is empty value pass string 
        // like -: public String();
        String sc= new String();
        String sc1=" ";
        System.out.println(sc+sc1);
       System.out.println( sc.length());
       // 2-: Constructor is pass one String 
       // like -: public String(String);
       String sc2=new String("JAI BHAWANI");
       // write in second way 
       String sc3="JAI BHAWANI";
       System.out.println(sc2);
       System.out.println(sc3);
       // 3-:Costructor pass char[] value and change into the string so that use this constructor 
       // like-: public String(char[]);
       char[] arr={'a','b','c','d'};
       //String sc4=arr; // it is give error because arr cannot conver into String data type  so then use object based variable for converting arr to string
       String sc4=new String(arr);
       System.out.println(sc4);
       //4-: Constructor pass (char[],int,int) value for find in between the string in char arr so use this contructor to find it 
       // like-: public String (char[],int,int);
       char[] arr1={'S','C','A','L','E','B','L','E'};
       String sc5=new String(arr1,0,5);
       System.out.println(sc5);
    }
}
