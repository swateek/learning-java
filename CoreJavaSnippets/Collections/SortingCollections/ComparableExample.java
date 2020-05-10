package CoreJavaSnippets.Collections.SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private long id;

    Person(Integer id){
        this.setId(id);
    }

    public int compareTo(Person o) {
        return (int) (getId() - o.getId());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
 }

public class ComparableExample {
    
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(10));
        list.add(new Person(2));
        list.add(new Person(15));

        System.out.println("Elements Before Sorting: ");
        for(Person i : list)
           System.out.print(" "+i.getId()); // 10 2 15
        System.out.println();
        System.out.println("Elements After Sorting: ");
        Collections.sort(list); 
        for(Person i : list)
           System.out.print(" "+i.getId()); // 2 10 15
    }
}