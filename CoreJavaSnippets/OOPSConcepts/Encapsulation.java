package CoreJavaSnippets.OOPSConcepts;

public class Encapsulation {
    public static void main(String args[]){
        Student std = new Student();
        std.setName("Swateek");
        std.setAddress("BAM");
        std.setRollNumber(8);

        System.out.println(std.getName());
    }
}

class Student {
    private String name;
    private int rollNumber;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}