public class example3 {
    // some code shows there behaviours 
    public static void main(String[] args) {
        String city1=new String("BHOPAL");
        String city2=new String("BHOPAL");
        System.out.println(city1);
        System.out.println(city2);
        System.out.println(city1==city2); // given FALSE 
        // Why it is given fasle because when created city2 object variable then in heap memory add new adress and given value "BHOPAL"
        // at 900 and first variable city one has memory adress is 600 so when compare city1==city2 show error because adress is not same of bhot variable .

        String city3="BHOPAL";
        String city4="BHOPAL";
        System.out.println(city3);
        System.out.println(city4);
        System.out.println(city3==city4); // given TRUE 
        // it is true because it is not a object based variable so it is store in SCP "STRING CONSENT POOL" memory so it store same data value one at a time 
        // its value not change or imutable so its showing true .The memory adress of city3==city4 is same so it is showing true. 

    }
}
