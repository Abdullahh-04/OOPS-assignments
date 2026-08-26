class Point {

    private int x;
    private int y;

    Point() {
        this.x = 0;
        this.y = 0;
    }

    Point(int x){
        this.x= x;
        this.y= x;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}