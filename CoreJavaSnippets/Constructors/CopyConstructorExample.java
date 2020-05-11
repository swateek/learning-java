package CoreJavaSnippets.Constructors;

class Point {
    final int x;
    final int y;
  
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
  
    public Point(Point p) { // copy constructor
      this(p.x, p.y);
    }  
}

public class CopyConstructorExample {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(p1);
        // This is a defensive copy because the original Point is protected from change by taking a copy of it.

        System.out.println(p1 == p2); // false
    }
}