public class Car {
    private String brand;
    private String model;
    private int year;
    private int price;
    Car(String brand , String model , int year , int price){
            this.brand=brand;
            this.model=model;
            this.year=year;
            this.price=price;
    }
    void displayinfo(){
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println(this.price);
    }
}
