package AdvanceJavaConcepts.CustomExceptions;

public class TestException {
    public static void main(String[] args) {
        try{
            throw new DBException.NoData("No row found for id : x");
        }catch(Exception e){
            e.printStackTrace();
            /*
                AdvanceJavaConcepts.CustomExceptions.DBException$NoData: No row found for id : x
                at AdvanceJavaConcepts.CustomExceptions.TestException.main(TestException.java:6)
            */
        }
    }
}