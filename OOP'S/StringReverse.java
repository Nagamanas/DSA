import java.util.Arrays;
public class StringReverse{
    public static void main(String[] args) {
        char [] arr={'h','e','l','l','o'};
        int left=0;
        int right=arr.length-1;
        char temp =' ';
       
            
        while(left<right){
              
       temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
     
        
       
    }
          System.out.println(Arrays.toString(arr));
    }
}