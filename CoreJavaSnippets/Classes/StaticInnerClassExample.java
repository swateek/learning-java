package CoreJavaSnippets.Classes;


public class StaticInnerClassExample {

    int nonStaticVal = 10;
    static int staticVal = 20;

    static private class InnerStatic {
        String innerVal;

        public String getInnerVal() {
            return innerVal;
        }

        public void setInnerVal(String innerVal) {
            this.innerVal = innerVal;
        }

        public String msg() {
            // return "The outer class's value is " + nonStaticVal; // cannot access non-static 
            return "The outer class's value is " + staticVal;
        }

        @Override
        public String toString(){
            return getInnerVal();
        }
    }

    public static void main(String[] args){
        //StaticInnerClassExample sic = new StaticInnerClassExample();
        //InnerStatic is = sic.new InnerStatic(); // won't work.
        InnerStatic is = new StaticInnerClassExample.InnerStatic();

        is.setInnerVal("Hello, Inner!");
        System.out.println(is.toString()); // Hello, Inner!

        System.out.println(is.msg()); // The outer class's value is 20

    }
}