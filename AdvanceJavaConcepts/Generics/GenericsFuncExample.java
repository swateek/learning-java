package AdvanceJavaConcepts.Generics;

public class GenericsFuncExample {

    static <T> void genericDisplay(T element){
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericDisplay("This will display a string");
        genericDisplay(11.03);

        /*
            java.lang.String = This will display a string
            java.lang.Double = 11.03
        */
    }
}