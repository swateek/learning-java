package CoreJavaSnippets.Classes;

public class ClassExample {
    private Long id;
    private String name;

    public ClassExample(){ // constructor

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "This class contains " + this.getName() + " with an id of " + this.getId();
    }
}