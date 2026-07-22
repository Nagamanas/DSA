class Car{

    String brand;
    String model;
    int speed;
    void accelerate(){
        speed+=10;



    }
    void brake(){
        speed-=10;


    }
    void display(){

        System.out.println(speed);
        
        System.out.println(brand);
        System.out.println(model);
    }
}
public class Main{

    public static void main(String[] args) {
        Car cr=new Car();
        cr.speed=50;
        cr.brand="Tata";
        cr.model="Tata siera";
        cr.accelerate();
        cr.brake();
        cr.display();

    }
}