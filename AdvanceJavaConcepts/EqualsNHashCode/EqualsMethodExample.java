package AdvanceJavaConcepts.EqualsNHashCode;

public class EqualsMethodExample {
    public static void main(String[] args) {
        A1 obj1 = new A1();
        A1 obj2 = new A1();

        System.out.println(obj1 == obj2); // false
        System.out.println(obj1.equals(obj2)); // false
        System.out.println(obj1.equals(obj1)); // true
    }
}

class A1 {
    A1(){

    }
}