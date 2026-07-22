public class Recurssion7{
    static int SumOfdigits(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=sum+n%10;
        return SumOfdigits(n/10,sum);
    }
    public static void main(String[] args) {
        System.out.println(SumOfdigits(12345,0));
    }
}