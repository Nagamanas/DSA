public class Recurssion2{
    static int printnumbers(int n){
        if(n==0){
            return 1;
        }
        System.out.println(n);
           return  printnumbers(n-1);
       
  
      
    }
    public static void main(String[] args) {
        printnumbers(5);
    }
}