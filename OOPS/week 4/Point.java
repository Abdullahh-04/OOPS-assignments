class Point {

    private int x;
    private int y;
    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }



    public Point add(Point p) {
        Point temp = new Point();

        temp.x = this.x + p.x;
        temp.y = this.y + p.y;

        return temp;
    }

    public Point add(Point p1, Point p2) {
        Point temp = new Point();

        temp.x = this.x + p1.x + p2.x;
        temp.y = this.y + p1.y + p2.y;

        return temp;
    }

    public Point subtract(Point p) {
        Point temp = new Point();

        temp.x = this.x - p.x;
        temp.y = this.y - p.y;

        return temp;
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}