public class Secondsmallest{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int smallest=arr[0];
        int Secondsmallest;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondsmallest=smallest;


                smallest=arr[i];

            }
        }
        System.out.println(secondsmallest);
    }
}