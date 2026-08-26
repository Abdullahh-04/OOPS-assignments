public class Main {
    public static void main(String[] args) {
        System.out.println("CAR CLASS");
        Car car1 =new Car("honda", "civic", 2016, 650000);
        Car car2 =new Car("toyta", "grande", 2022, 719999);
        car1.displayinfo();

        Point p1 = new Point(2, 3);
        Point p2 = new Point(4, 5);
        Point p3 = new Point(6, 7);

        System.out.println("POINT CLASS");
        System.out.println("P1 = " + p1);
        System.out.println("P2 = " + p2);
        System.out.println("P3 = " + p3);

        System.out.println("P1 + P2 = " + p1.add(p2));
        System.out.println("P1 + P2 + P3 = " + p1.add(p2, p3));
        System.out.println("P1 - P2 = " + p1.subtract(p2));

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(p1);
        Triangle t3 = new Triangle(p1, p2);
        Triangle t4 = new Triangle(p1, p2, p3);
        Triangle t5 = new Triangle(t4);

        System.out.println("\nTRIANGLE CLASS");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);
        ComplexNumber c3 = new ComplexNumber(6, 7);

        System.out.println("\nCOMPLEX NUMBER CLASS");
        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);
        System.out.println("C3 = " + c3);

        System.out.println("C1 + C2 = " + c1.add(c2));
        System.out.println("C1 + C2 + C3 = " + c1.add(c2, c3));
        System.out.println("C1 - C2 = " + c1.subtract(c2));

        Line L1 = new Line();
        Line L2 = new Line(p1, p3);
        Line L3 = new Line(L2);
        System.out.println("LINE CLASS");
        System.out.println(L3);
        System.out.println(L2);

        RationalNumber r1 = new RationalNumber(1, 2);
        RationalNumber r2 = new RationalNumber(3, 4);
        RationalNumber r3 = new RationalNumber(5, 6);

        System.out.println("\nRATIONAL NUMBER CLASS");
        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);

        System.out.println("R1 + R2 = " + r1.add(r2));
        System.out.println("R1 + R2 + R3 = " + r1.add(r2, r3));
        System.out.println("R1 - R2 = " + r1.subtract(r2));
    }
}