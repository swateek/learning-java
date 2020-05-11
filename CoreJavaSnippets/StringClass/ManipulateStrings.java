package CoreJavaSnippets.StringClass;

public class ManipulateStrings {
    public static void main(String[] args) {

        // String Class
        String s1 = "This is string class literal - mutable.";
        s1 = s1 + " This append will create a new literal in pool.";
        System.out.println(s1); // This is string class literal - mutable. This append will create a new literal in pool.
        
        // StringBuffer
        StringBuffer s2 = new StringBuffer("StringBuffer is mutable. ");
        System.out.println(s2.length()); // 25 -  length of string above.
        System.out.println(s2.capacity()); // 41 - allocated capacity to the string above.
        s2.append("StringBuffer class is synchronized (thread safe!), and this append modifies the original string");
        System.out.println(s2); // StringBuffer is mutable. StringBuffer class is synchronized (thread safe!), and this append modifies the original string

        // StringBuilder
        StringBuilder s3 = new StringBuilder("StringBuilder is mutable. ");
        System.out.println(s3.length()); // 26 - length of string above. Output = 
        System.out.println(s3.capacity()); // 42 -  allocated capacity to the string above.
        s3.append("StringBuilder class is non-synchronized (hence, not thread safe), and this append modifies the original string");
        System.out.println(s3); // StringBuilder is mutable. StringBuilder class is non-synchronized (hence, not thread safe), and this append modifies the original string

        // String intern()
        String s4 = "Cuttack";
        String s5 = new String("Cuttack");
        System.out.println(s4 == s5); // false, because string literal is created in string pool while string object is created in heap memory.
        String s6 = s4.intern();
        String s7 = s5.intern();
        System.out.println(s6 == s4); // true, since both are present in string pool.
        System.out.println(s5 == s7); // false
        System.out.println(s6 == s7); // true, since both are present in string pool.
    }
}