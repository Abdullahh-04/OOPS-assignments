public class Line {
    private Point P_start;
    private Point P_End;

Line(){
    this.P_start=new Point();
    this.P_End=new Point(1, 1);
}
Line(Point a,Point b){
    this.P_start=a;
    this.P_End=b;
}
Line(Line L1){
    this.P_start=L1.P_start;
    this.P_End=L1.P_End;
}
@Override
public String toString(){
    return "("+P_start+","+P_End+")";
}
}
