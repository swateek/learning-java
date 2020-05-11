package CoreJavaSnippets.Classes;

public class UseClassExample {
    public static void main(String[] args) {
        ClassExample ce = new ClassExample();
        ce.setId(1L);
        ce.setName("AVeryLongName");

        System.out.println(ce.toString()); // This class contains AVeryLongName with an id of 1
    }
}