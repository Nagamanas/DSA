public class Pattern19{
    public static void main(String[] args) {
        int n=9;
        for(int i=1;i<=9;i++){
            if(i<=n/2+1){
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
               }
               for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1){
                        System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }
            }
            else{
                int k=n-i+1;
                for(int j=1;j<=n-k;j++){
                        System.out.print(" ");

                }
                 for(int j=1;j<=2*k-1;j++){
                if(j==1||j==2*k-1){
                        System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               }

            }
            System.out.println();
        }
    }
}