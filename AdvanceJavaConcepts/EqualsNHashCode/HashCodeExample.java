package AdvanceJavaConcepts.EqualsNHashCode;

public class HashCodeExample {
    public static void main(String[] args) {
        A2 obj1 = new A2();
        A2 obj2 = new A2();

        System.out.println(obj1.hashCode()); // 32374789
        System.out.println(obj2.hashCode()); // 1023487453
    }
}

class A2 {
    A2(){

    }
}