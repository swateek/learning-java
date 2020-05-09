package CoreJavaSnippets;

public class Conditionals {
    public static void main(String[] args) {
        // if else
        System.out.println("** Testing if..else **");
        if("a" == "b"){
            System.out.println("Yes"); // this is never reached
        }else{
            System.out.println("No! a is not equal to b");
        }

        // switch statement
        System.out.println("** Testing Switch Case **");
        String value = "Swateek";
        switch(value){
            case "Ricky":
                System.out.println("Ricky.. you said?");
                break;
            case "Jena":
                System.out.println("Jena.. you said?");
                break;
            case "Swateek":
                System.out.println("Swateek.. you said?");
                break;
            default:
                System.out.println("Found Nothing..");
        }

        // while statement
        System.out.println("** Testing While Loop **");
        int i = 0;
        while(i <= 10){
            System.out.println("while loop - value of i: " + i);
            i++;
        }

        // do..while statement
        System.out.println("** Testing Do..While Loop **");
        int j = 0;
        do {
            System.out.println("do..while loop - value of j: " + j);
            j++;
        }while(j <= 10);
        
        // for loop
        System.out.println("** Testing For Loop **");
        for(int k=0; k<=10; k++){
            System.out.println("for loop - value of k: " + k);
        }
    }
}