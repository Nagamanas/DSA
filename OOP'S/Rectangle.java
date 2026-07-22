class Rectangle{

    int length;
    int breadth;
    int area;
    int perimeter;

    void area (){
        
         area =(length*breadth);
    }
    void perimeter(){
         perimeter =2*(length+breadth);
    }
    void display(){

        System.out.println(area);
        
        System.out.println(perimeter);
    }
}
public class Main{
    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        re.length=26;
        re.breadth=25;
        re.area();
        re.perimeter();
        
        re.display();
      

    }
}