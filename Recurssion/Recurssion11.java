public class Recurssion11{
    static  boolean power(int n){
        if(n==1){
            return true;
        }
        if(n<=0||n%3!=0){
            return false;
        }
        return power(n/3);
    }
    public static void main(String[] args) {
    System.out.println(power(27));
        
    }
}