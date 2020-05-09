package CoreJavaSnippets.StringClass;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.StringJoiner;

public class StringExample {
    public static void main(String[] args) {
        
        System.out.println("******************************************* String Literal vs new() *******************************************");
        // declare as String Literal
        String a4 = "apple";
        System.out.println("Using String Literal - " + a4);

        // declare using new keyword
        String b4 = new String("banana");
        System.out.println("Using new keyword - " + b4);

        String s1 = "dog";
        String s2 = new String("dog");
        System.out.println("s1 == s2 : " + (s1==s2)); //they point to different string instances. literal in pool, new keyword in heap.
        String s3 = "dog";
        System.out.println("s1 == s3 : " + (s1==s3)); // they point to the same string in string pool.
        // The above three are all of the same class.
        System.out.println(s1.getClass().getName()); // java.lang.String
        System.out.println(s2.getClass().getName()); // java.lang.String
        System.out.println(s3.getClass().getName()); // java.lang.String

        System.out.println("******************************************* StringTokenizer *******************************************");
        StringTokenizer tokenString = new StringTokenizer("Hello World, How are you doing today?", " ");
        while(tokenString.hasMoreTokens()){
            System.out.println(tokenString.nextToken());
        }

        System.out.println("******************************************* StringJoiner *******************************************");
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Bhubaneswar");
        cities.add("Berhampur");
        cities.add("Bangalore");
        cities.add("Cuttack");
        StringJoiner joinString = new StringJoiner(", ");
        System.out.println(joinString);
        joinString.setEmptyValue("the string is currently is empty");
        System.out.println(joinString);
        for (String str : cities) {
            joinString.add(str);
        }
        System.out.println(joinString);
    }
}