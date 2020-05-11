package AdvanceJavaConcepts.ApacheCommonsExample;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

class Student {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(){
    }

   @Override
   public int hashCode(){
    return new HashCodeBuilder().append(this.id).append(this.name).toHashCode();
   }

   @Override
   public boolean equals(Object obj){
    if (obj instanceof Student == false)
      {
        return false;
      }
      if (this == obj)
      {
         return true;
      }
      final Student otherObject = (Student) obj;

      return new EqualsBuilder()
         .append(this.id, otherObject.id)
         .append(this.name, otherObject.name)
         .isEquals(); 
   }

   public void setId(Long id) {
       this.id = id;
   }

   public void setName(String name) {
       this.name = name;
   }
    
}

public class EqualsNHashCodeBuilderExample {
    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setId(10L);
        stud1.setName("Carol");

        Student stud2 = new Student();
        stud2.setId(10L);
        stud2.setName("Carol");

        System.out.println("stud1.hashCode() = " + stud1.hashCode());
        System.out.println("stud2.hashCode() = " + stud2.hashCode());

        System.out.println("stud1.equals(stud2) = " + stud1.equals(stud2));

        /*
         *  stud1.hashCode() = 64902380
         *  stud2.hashCode() = 64902380
         *  stud1.equals(stud2) = true
        */
    }
}