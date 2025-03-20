public class Main {
    public static void main(String[] args) {
       
        Point p1 = new Point();
        String s1 = new String("Ali");
        System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);
        Point p2 = new Point(3, 4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);
        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);
    
        Point tleft = new Point( 3 , 4 );
        Rectangle r1 = new Rectangle(tleft, 3, 4);
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.gettopLeft().xCoord);
        System.out.println(r1.gettopLeft().yCoord);

        Circle c1 = new Circle( new Point( 3, 4 ), 5);
        System.out.println(c1.getRadius());
        c1.setRadius(-21);
        System.out.println(c1.getRadius());
    }
}