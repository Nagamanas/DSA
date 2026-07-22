public class Pattern14{
    public static void main(String[] args) {
        int n=5;
        int os=n/2;
        int isp=-1;
     
       for(int i=1;i<=n;i++){

        for(int j=1;j<=os;j++){
            System.out.print("\t");
        }
        System.out.print("*\t");
        if(isp>=1){
            for(int j=1;j<=isp;j++){
            System.out.print("\t");
            }
            System.out.print("*\t");
        }
        if(i<=n/2){
            os--;
            isp+=2;
        }
        else{
            os++;
            isp-=2;
        }
        System.out.println();
       }

    }
}