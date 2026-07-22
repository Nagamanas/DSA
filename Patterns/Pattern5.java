public class Pattern5{
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
         
            if(i<=5){
         for(int j=1;j<=5-i;j++){
           
            System.out.print(" ");
         
        }
         int k=2*i-1;
        for(int j=1;j<=k;j++){
            System.out.print("*");
        }
    
    }

    else{
        int star=10-i;
        int k=2*star-1;
       for (int j = 1; j <= i - 5; j++) {
    System.out.print(" ");
}
         for(int j=1;j<=k;j++){
            System.out.print("*");


    }




        }
        System.out.println();
    }

}
}