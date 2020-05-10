package AdvanceJavaConcepts.EqualsNHashCode;

import java.util.HashMap;
import java.util.Map;

class NoOverrides {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "NoOverride [name= " + this.name + " id= " + this.id + "]";
    }
}

public class OverrideEqualsNHashExample {
    public static void main(String[] args) {
        Map<NoOverrides, Integer> map1 = new HashMap<NoOverrides, Integer>();
        
        NoOverrides no1 = new NoOverrides();
        no1.setId(1);
        no1.setName("Swateek");
        System.out.println(no1.hashCode()); // 1973538135
        map1.put(no1, 1);
        //System.out.println(map1); // {AdvanceJavaConcepts.EqualsNHashCode.NoOverrides@75a1cd57=1} ~ when toString() isn't overridden
        System.out.println(map1); // {NoOverride [name= Swateek id= 1]=1}

        // Now let's retrieve the same record.
        NoOverrides no2 = new NoOverrides();
        no2.setId(1);
        no2.setName("Swateek");
        System.out.println(no2.hashCode()); // 1694819250 !! A different hashcode. 
        System.out.println(map1.get(no2)); // null

        // Thus, we definitely to override hashCode and Equals

        Map<AllOverrides, Integer> map2 = new HashMap<AllOverrides, Integer>();
        
        AllOverrides ao1 = new AllOverrides();
        ao1.setId(1);
        ao1.setName("Swateek");
        System.out.println(ao1.hashCode()); // -146598252
        map2.put(ao1, 1);
        System.out.println(map2); // {AllOverride [name= Swateek id= 1]=1}

        // Now let's retrieve the same record.
        AllOverrides ao2 = new AllOverrides();
        ao2.setId(1);
        ao2.setName("Swateek");
        System.out.println(ao2.hashCode()); // -146598252, the exact same Hash
        System.out.println(map2.get(ao2)); // 1, the expected value
    }
}

class AllOverrides {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "AllOverride [name= " + this.name + " id= " + this.id + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AllOverrides other = (AllOverrides) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}