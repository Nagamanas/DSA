class Student1{
    String Name;
    int age;
    double cgpa;
    Student1(){
        Name="Sunny";
        age=19;
        cgpa=9.1;
    }
    void display(){
        System.err.println(Name);
             System.err.println(age);
                  System.err.println(cgpa);
    }
}
public class Main{

    public static void main(String[] args){
        Student1 s1=new Student1();
        s1.display();
    }
}