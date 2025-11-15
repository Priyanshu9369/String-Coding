
// Differenece between String and Stringbuffer
public class example1 {
    public static void main(String[] args) {
        String sc= new String("JAUNPUR");
        String sc1=new String("JAUNPUR");
        String SC1="JAUNPUR";
        String sc2="JAUNPUR";
        //The main difference between String and String buffer is -: String create without object but Stringbuffer can not create when object are not available like new keywords.
        // The second difference when print 2 string in sout() function code is automatic run but when string buffer variable run in a sout() function then give error but when one 
        // is string and one is string buffer run then code is run 
        StringBuffer sc3=new StringBuffer("MARIAHU");
        StringBuffer sc4=new StringBuffer("MARIAHU");
        System.out.println(sc3);
        System.out.println(sc4);
    }
}
