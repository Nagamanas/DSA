public class Recurssion6{
   static int countdigit(int n){
    if(n==0){
        return 0;
    }
        return 1+countdigit(n/10);
   }
   public static void main(String[] args) {
    System.out.println(countdigit(12345));
   }
}