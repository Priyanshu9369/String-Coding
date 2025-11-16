public class example4 {
    // methods of the String types 
    public static void main(String[] args) {
        String s="Hello";
        // 1-: It show the index of the string whith the method =[s.charAt() ].Used for find the index value in an string 
        //System.out.println(s[0]); It is error because s is not a array it is string 
        // Show use it charAt(0);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(4));
       /* 
        System.out.println(s.charAt(10));
       Exception: StringIndexOutOfBoundsException: Index 10 out of bounds for length 5

       //*/
       // 2-: It fine the length of the string with the method = public int length()
        
       String name="Priyanshu";
       System.out.println("The length of the string is -:"+ name.length());

       // 3-: It compare the two String and give the forst string is equal to second string or not 
       // its method is = public boolen equals(object)
        
       String s1="Priyanshu";
       String s2="Priyanshu";
       System.out.println(s1.equals(s2));
       // case -:
       String s3="priyanshu";
       System.out.println(s1.equals(s3)); // it shows false because S1-"P" is in captial letter but S2-"p" is smal letter thus it shows false .

       //4-: It ignore the captial letter and small letter when word is same then give true in any case word is captial or in small letter 

       String s4="SHYAM";
       String s5="shyam";
       System.out.println(s4.equalsIgnoreCase(s5));
       // case when word is different then what shows it 
       String s6="sundar";
       System.out.println(s5.equalsIgnoreCase(s6));

    }
}
