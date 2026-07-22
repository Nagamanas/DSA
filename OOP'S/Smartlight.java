 class Smartlight {
    int Brightness;
    boolean turnOn;
  


     void turnon(){
        if(turnOn==false){
            turnOn=true;
        }
        else{
            System.out.println("Fan turn offed");
        }
     }
     void turnof(){
        if(turnon){
        turnOn=false;
        System.out.println("Fan offed");
        }
     }
     void increasebrightness(){
        if(turnon){
           if(Brightness<=90){
         Brightness+=10;
           }
           else{
            Brightness=100;
           }
         System.out.println(Brightness);
           
        }
        else{
            System.out.println("light turn offed");
        }



     }
     void decreasebrightness(){
       if(turnon){
           if(Brightness<=90){
         Brightness-=10;
           }
           else{
            Brightness=0;
           }
         System.out.println(Brightness);
           
        }
        else{
            System.out.println("light turn offed");
        }
     }
     Smartlight(int b1){
            Brightness=b1;
     }
    
}
public class Main{
    public static void main(String[] args) {
        Smartlight s=new Smartlight(16);
        s.turnOn();
        s.increasebrightness();
        s.decreasebrightness();
        s.turnof();
    }
}
