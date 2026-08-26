public class Circle {
    private Point C;
    private int r;

    Circle(){
        this.C=new Point();
        this.r=1;
    }

    Circle(Point C , int r){
        this.C= new Point(C);
        this.r=r;
    }
    public String toString(){
        return "centre of circle:"+C+" radius of circle:"+r;
    }
}
