package AdvanceJavaConcepts.Generics;

class UsesGenerics<T> {
    T obj;

    UsesGenerics(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }
}

// Driver class to test above
public class GenericsClassExample {
    public static void main(String[] args) {
        UsesGenerics<String> strObj = new UsesGenerics<String>("A new string");
        UsesGenerics<Integer> intObj = new UsesGenerics<Integer>(2);

        System.out.println(strObj); // AdvanceJavaConcepts.Generics.UsesGenerics@75a1cd57
        System.out.println(intObj); // AdvanceJavaConcepts.Generics.UsesGenerics@3d012ddd
        System.out.println(strObj.getObj()); // "A new string"
        System.out.println(intObj.getObj()); // 2
    }
}