class Wallet{
    boolean islogged;
    int balance;
    int password;

    void login(int enterpin){
          if(enterpin==password){
            islogged =true;
          }

    }
    void logout(){
        islogged =false;
    }
    void addmoney(int amount){
        if(islogged){
            balance+=amount;
            System.out.println("amount added " +amount);
        }
        else{
            System.out.println("Logged out");
        }
    }
    void buyitem(int price){
        if(islogged){
            if(balance>=price){
                balance-=price;
              
            }
            else{
                System.out.println("Insufficient balance");
            }

        }
        else{
            System.out.println("Logged out");
        }
    }
    Wallet (){
        islogged=false;
         password=1234;
         balance=5000;
         
    }
    void display(){
        System.out.println(balance);
    }
    
}
public class main{
    public static void Main(String[] args) {
        Wallet w1=new Wallet();
        

        w1.login(1111);      // Wrong password
        w1.addMoney(1000);   // Should fail

        w1.login(1234);      // Correct password

        w1.buyItem(6000);    // Should fail (5000 < 6000)

        w1.addmoney(3000);   // Balance = 8000

        w1.buyItem(6000);    // Balance = 2000

        w1.logout();

        w1.addMoney(500);    // Should fail

        w1.display();
    }
}
