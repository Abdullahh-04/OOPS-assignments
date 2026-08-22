public class triangle{
    private int x;
    private int y;
    //null constructor
    triangle(){
       this.x = 1;
       this.y = 8;
    }
   //paramitrize 
   triangle(int a, int y){
      this.x = a;
      this.y = y;
   }
   public String toString(){
      return"triangle(x=" + x + "y=" + y + ")";
   }
   public triangle add(triangle t){
      triangle a =new triangle();
      a.x = this.x + t.x;
      a.y = this.y + t.y;
      return a;

      
   }
}