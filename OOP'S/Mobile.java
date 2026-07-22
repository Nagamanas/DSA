class Mobile{
    String brand;
    String model;
    int price;
    Mobile(String s,String s2,int p){
        brand=s;
        model=s2;
        price=p;

    }
    void display(){
        System.out.println(brand);
         System.out.println(model);
          System.out.println(price);
    }
}
public class Main{
    public static void main(String[] args) {
        Mobile m1=new Mobile("OPPO", "A5", 18000);
        Mobile m2=new Mobile("Samsung", "s6", 180000);
        m1.display();
        m2.display();
    }
}
