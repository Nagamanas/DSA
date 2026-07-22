class Ticket{
    String movieName;
int ticketPrice;
int seats;
boolean booked ;
void bookticket(){
    if(!booked){
        booked=true;
    }
    else{
        System.out.println("Ticket already booked");
    }

}
void cancelticket(){
    if(booked){
        booked=false;
    }
    else{
        System.out.println("Ticked not booked");
    }
}
void display(){
    if(booked){
        System.out.println("Ticket booked");
    }
    else{
        System.out.println("Ticket cancelled");
    }
}
Ticket(String s,int tic,int s1){
   movieName=s; 
ticketPrice=tic;
seats=s1;
}
}
public class Main{
    public static void main(String[] args) {
        Ticket t1=new Ticket("Interstellar", 300, 2);
        t1.bookTicket();
t1.bookTicket();
t1.cancelTicket();
t1.cancelTicket();

t1.display();
    }
}