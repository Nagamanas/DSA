class Bankaccount{
    String name;
    int balance;
    void display(){
        System.out.println(name);
        System.out.println(balance);
    }
}
public class Main{
    public static void main(String[] args) {
        
Bankaccount account=new Bankaccount();
account.name="Sunny";
account.balance=10000000;
account.display();


        
    }
}