public class Recurssion{
    static void binarydigit(int n){
        if(n==0){
            return ;

        }

        
            int x=n%2;
              binarydigit(n/2);
            System.out.print(x);
            
        
    }
    public static void main(String[] args) {
        binarydigit(5);
    }
} 