class Laptop{
    String Name;
    String brand;
    String processor;
    int ram;
    int rom;
    int battery;
    boolean isOn=false;
    void turnOn(){
        if(!isOn){
            isOn=true;
        }
        else{
            System.out.println("Laptop already turned on");
        }
    }
    void turnOf(){
        if(isOn){
            isOn=false;
        }
        else{
            System.out.println("laptop already turned off");
        }
    }
    void charge(int percent){
        if(!isOn){
        battery+=percent;
        
        if(battery>100){
            battery=100;
        }
    }
    else{
        System.out.println("Turn off the laptop first");
    }
    }
    void uselaptop(int percent){
        if(isOn){
            battery-=percent;
            if(battery<0){
                battery=0;
            }

        
        if(battery==0){
            isOn=false;
            System.out.println("Battery dead");
        }
    }
        else{
            System.out.println("Turnon the laptop first");
        }

    }
    void display(){
        System.out.println(Name);
           System.out.println(brand);
              System.out.println(processor);
                 System.out.println(ram);
                    System.out.println(rom);
                       System.out.println(battery);
                          System.out.println(isOn);


    }
    Laptop(String Name,String brand,String processor, int ram,int rom,int battery){
              this.Name=Name;
              this.brand=brand;
              this.processor=processor;
              this.ram=ram;
              this.rom=rom;
              this.battery=battery;

    }
}
public class Main{
    public static void main(String[] args) {
        Laptop l1 = new Laptop("victus", "HP","i7",16,512,80);

l1.uselaptop(20);
l1.turnOn();
l1.uselaptop(50);
l1.uselaptop(60);
l1.charge(40);        // Battery: 0 -> 40
l1.turnOn();
l1.charge(30);        // Should fail (ON)
l1.display();
    }
}