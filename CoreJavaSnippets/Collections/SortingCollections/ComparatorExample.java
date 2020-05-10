package CoreJavaSnippets.Collections.SortingCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private long id;

    public Student(long id) {
        this.setId(id);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

class StudentComparatorAsc implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
         return (int) (o1.getId() - o2.getId());
    }
}

class StudentComparatorDesc implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
         return (int) (o2.getId() - o1.getId());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(10));
        list.add(new Student(2));
        list.add(new Student(15));

        System.out.println("Elements Before Sorting: ");
        for(Student i : list)
           System.out.print(" "+i.getId()); // 10 2 15
        System.out.println();
        System.out.println("Elements After Sorting - Ascending: ");
        Collections.sort(list, new StudentComparatorAsc());
        for(Student i : list)
           System.out.print(" "+i.getId()); // 2 10 15
           System.out.println("Elements After Sorting - Descending: ");
        Collections.sort(list, new StudentComparatorDesc());
        for(Student i : list)
            System.out.print(" "+i.getId()); // 15 10 2
    }
}