class Locker{
    int pin;
    boolean islocked;
    int money;
    
    

    void unlock(int enterpin){
        if(enterpin==pin){
            islocked=false;
             System.out.println("locker unlocked");
        }
        else{
            islocked=true;
        }
        
    }
    void lock(){
        islocked=true;
        System.out.println("locker locked");
    }
    void deposit(int amount){
        if(!islocked){
             money+=amount;
             System.out.println(amount + "deposited");
        }
        else{
            System.out.println("locker locked");
        }
        
    }
    void withdraw(int amount){
        if(!islocked ){
            if(money>=amount){
            money-=amount;
            System.out.println(amount + "withdrawed");
            }
            else{
                System.out.println("Insuffisient balance");
            }
        }
        else{
            System.out.println("locker is locked ");
        }
        
    }

    Locker(){
        pin=1234;
        islocked=true;
        money=1000;
    }
    void display(){
        System.out.println(money);
    }
}
public class Main{
    public static void main(String[] args) {
        Locker l1=new Locker();
         l1.unlock(1111);
        l1.deposit(1000);

        l1.unlock(1234);
        l1.deposit(1000);

        l1.withdraw(7000);
        l1.withdraw(3000);

        l1.lock();

        l1.display();
        
    }
}
