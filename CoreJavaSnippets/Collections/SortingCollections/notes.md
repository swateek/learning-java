### Comparable vs Comparator

[Details Here](http://kveeresham.blogspot.com/2014/01/comparable-vs-comparator.html)

| Description | Comparable | Comparator |
| ----------- | ----------- | ----------- |
| Package | java.lang.Comparable | java.util.Comparator |
| Implementation | implemented in the same class which is to be compared. | needs to be implemented as a separate class. |
| Arguments | needs to compare with itself, hence takes only one argument. Return an integer value. | takes two argument of the same type, returns an integer value after comparing them. |
| Collection.sort() | no extra argument during sort, Collection.sort() uses compareTo method | Collection.sort() requires comparator object as second argument and collection as the first. |
| Sorting | always based on compareTo method | based on the comparator that is passed. |