package CoreJavaSnippets.Classes;


public class StaticInnerClassExample {
    static private class InnerStatic {
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

    public static void main(String[] args){
        
    }
}