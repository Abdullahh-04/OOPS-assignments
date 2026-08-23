public class Main {
  public static void main(String[] args){
     triangle t1 = new triangle();
     triangle t2 = new triangle(6,6);
     System.out.println(t2);
     triangle newTriangle = t1.add(t2);
     System.out.println(newTriangle);

     // car class 
     Car C1=new Car("toyota", "grande", 2025, 650000);
     Car C2=new Car("honda", "civic", 2020, 550000);
     C1.displayinfo();
     C2.displayinfo();
}
  }
  