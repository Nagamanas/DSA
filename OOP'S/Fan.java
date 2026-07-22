class fan{
    String brand;
    String Name;
    int speed;
    boolean isOn;


    void turnOn(){
        isOn=true;
    }
    void turnOf(){
        isOn=false;
    }
    void increasespeed(){

        if(isOn){
            speed++;
        }
    }
    void display(){
        System.out.println(brand);
        System.out.println(Name);
        System.out.println(isOn);   
        System.out.println(speed);
       
    }
}
public class Main{
    public static void main(String[] args){
        fan f=new fan();
        f.brand="Philiphs";
        f.Name="philiphs huge";
        f.turnOn();
        
        f.increasespeed();
        f.display();
    }
}