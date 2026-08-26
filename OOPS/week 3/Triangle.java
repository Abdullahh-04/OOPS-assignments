class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    Triangle() {
        this.p1 = new Point();
        this.p2 = new Point();
        this.p3 = new Point();
    }

    Triangle(Point a) {
        this.p1 = new Point(a);
        this.p2 = new Point(a);
        this.p3 = new Point(a);
    }

    Triangle(Point a, Point b) {
        this.p1 = new Point(a);
        this.p2 = new Point(a);
        this.p3 = new Point(b);
    }

    Triangle(Point a, Point b, Point c) {
        this.p1 = new Point(a);
        this.p2 = new Point(b);
        this.p3 = new Point(c);
    }

    Triangle(Triangle t) {
        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);
    }
    @Override
    public String toString() {
        return "Triangle: " + this.p1 + ", " + this.p2 + ", " + this.p3;
    }
}