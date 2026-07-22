class Atm{
    int balance;
    boolean cardinserted;
    void insertcard(){
        cardinserted=true;
        System.out.println("Card inserted");
    }
    void removecard(){
        cardinserted=false;
        System.out.println("Card removed");
    }
    void deposit(int amount){
        if(cardinserted){
            balance+=amount;

        }
    }
    void withdraw(int amount){
        if(cardinserted && balance>=amount){
            balance=balance-amount;
        }
        else{
            System.out.println("Insufficient balance or card not inserted");
        }

    }
    void display(){
      
       
        
        System.out.println(balance);
  

    }
}
public class Main{
    public static void main(String[] args) {
        Atm At=new Atm();
        
        At.balance=1000;
        At.insertcard();
        At.balance=1000;
        At.deposit(100000);
        At.withdraw(1000);
        At.removecard();
        At.display();
    }
}