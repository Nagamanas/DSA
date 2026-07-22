public class Recurssion13{
    static int Sum(int n){
        if(n<10){
            return n;
        }
        int sum=0;
        while(n>0){
            sum =sum+n%10;
            n=n/10;
        }
        return Sum(sum);
    }
    public static void main(String[] args) {
        System.out.println(Sum(46));
    }
}