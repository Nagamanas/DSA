class Employee{
    
    String Name;
    int id;
    int salary;
    void display(){
     System.out.println(Name);
      System.out.println(id);
       System.out.println(salary);

    }
}
public class Main{
    public static void main(String[] args){

        Employee EM= new Employee();
        EM.Name="Sunny";
        EM.id=1;
        EM.salary=26000;
        EM.display();


    }
}