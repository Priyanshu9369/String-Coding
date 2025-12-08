import java.util.*;
public class example5 {
    // StringBuffer class of Constructor and Method 
    // Constructor of StringBuffer class 
    // 1-: public StringBuffer(). this is 0 based parameter Constructor
    public static void main(String[] args) {
        // 1-: public StringBuffer(). this is 0 based parameter Constructor
        StringBuffer sb=new StringBuffer();
        System.out.println(sb);
        // 2-: public StringBuffer(int). this is int type parameter
        StringBuffer sb1=new StringBuffer(4); 
        System.out.println(sb1);
        // 3-: public StringBuffer(String). this is a String parameter 
        StringBuffer sb2=new StringBuffer("priyanshu");
        System.out.println(sb2);
    
        // Method of StringBuffer class 
        
        // 1-: methos of StringBuffer class is -: public int length() it is used for to find the length of character in give StringBuffer
        // example 
        StringBuffer sb3=new StringBuffer();
        System.out.println(sb3.length());
        // 2-: method of StringBuffer class is -: public int capacity() it is used for find the size of buffer in given StringBuffer class.
        StringBuffer sb4=new StringBuffer("Priyanshu");
        System.out.println(sb4);// output the value of sb4 StringBuffer value 
        System.out.println(sb4.length());// the length of  String -"Priyanshu" is -: 9
        System.out.println(sb4.capacity()); // given output is 25 means (length of priyanshu + 16 default buffer size )
        
        // 3-: Methods of StringBuffer class is-: public stringbuffer append(string) it is used for add somethings in string class .. 
        // and it is primitive types as well as so it add anythings like array , int , string special char also it add any things 
        
        // example
        StringBuffer sb5=new StringBuffer("my name is ");
        System.out.println(sb5);
        sb5.append("priyanshu yadav");
        System.out.println("print after using append methood -:"+sb5);
        // 4-: Methods os StringBuffer class is -: public void ensurecapacity(int) it is used for to given capacity by user and decide by user ,what capacity give it 
        // so it is used for it .
        StringBuffer sb6=new StringBuffer("A cup");
        System.out.println(sb6.length());
        System.out.println(sb6.capacity());
        System.out.println(sb6);
        sb6.ensureCapacity(50);
        sb6.append("on table");
        System.out.println(sb6);
        System.out.println(sb6.length());
        System.out.println(sb6.capacity());
        
        // 5-: Methods of StringBuffer class is-: public char charAt(int) it is used for to find the character..
         StringBuffer sb7=new StringBuffer("priyanshu");
         System.out.println(sb7);
         System.out.println(sb7.charAt(0));
         System.out.println(sb7.charAt(8));
        // 6-: Methods of StringBuffer class is -: public void setcharAt(int,char)
         StringBuffer sb8=new StringBuffer("my name is riyanshu");
         System.out.println(sb8);
         
            sb8.setCharAt(11, 'p');
            System.out.println(sb8);
            // 7-: Methods of StringBuffer class is-: public StringBuffer delete(int,int)
            //it is uesd for delete the string from (int,int) index based
            //Example is -: 
            sb8.delete(11, 19);
            System.out.println(sb8);
            // 8-: Methods of StringBuffer class is-: public StringBuffer reverse()
            // example
            sb8.reverse();
            System.out.println(sb8);
            //9-:Methods of StringBuffer class is-: public stringbuffer replace(int,int,String)
            // example
            sb8.delete(0, 11);
            System.out.println(sb8);
            sb8.append("my priyanshu");
            System.out.println(sb8);
            // use method 9 
            // example
            sb8.replace(0, 2, "I") ;
            System.out.println(sb8);
    }
}
