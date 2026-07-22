import java.util.Arrays;
public class Square{
    public static void main(String[] args) {
        int [] arr={-4,-3,-1,0,1,2,3,4};
         int left=0;
         int right=arr.length-1;
         int n=arr.length;
         int [] result=new int [n];
         int k=arr.length-1;

         while(left<=right){
           int leftsquare=arr[left]*arr[left];
           int rightsquare=arr[right]*arr[right];
           if(leftsquare>rightsquare){
            result[k]=leftsquare;
            left++;

           }
           else{
            result[k]=rightsquare;
            right--;
           }
           k--;
          
         }
         System.out.println(Arrays.toString(result));

    }
}