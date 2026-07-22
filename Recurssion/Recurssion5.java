public class Recurssion5{
    static int Power(int n,int x){
        if(x==0){
            return 1;
        }
        return n*Power(n, x-1);
    }
    public static void main(String[] args) {
        System.out.println(Power(4,5));
    }
}