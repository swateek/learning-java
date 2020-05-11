package CoreJavaSnippets.Classes;

public class InnerClassExample {

    String outerVal = "out";

    private class MyInnerClass {
        String innerVal;

        public String getInnerVal() {
            return innerVal;
        }

        public void setInnerVal(String innerVal) {
            this.innerVal = innerVal;
        }

        @Override
        public String toString(){
            return getInnerVal();
        }

    }

    public static void main(String[] args) {
        InnerClassExample toAccess = new InnerClassExample();

        //MyInnerClass myClass = new MyInnerClass(); // won't work, since inner class
        MyInnerClass myInnerClass = toAccess.new MyInnerClass();
        myInnerClass.setInnerVal("Hello, From your inner class");

        // another way
        InnerClassExample.MyInnerClass newObj = new InnerClassExample().new MyInnerClass();
        newObj.setInnerVal("Did you see the fancy new way?");

        System.out.println(myInnerClass.toString()); // Hello, From your inner class
        System.out.println(newObj.toString()); // Did you see the fancy new way?
    }
    
}