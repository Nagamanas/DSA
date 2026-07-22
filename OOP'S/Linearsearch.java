public class Linearsearch{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int val=5;
        int j=-1;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
              found=true;
              j=i;
            }

        }
        if(found){
            System.out.print(j);
        }
        else{
         System.out.print("Not found");
        }
    }
}