public class Pattern4 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){

            for(int j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            int k=2*i-1;
            for(int j=1;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}