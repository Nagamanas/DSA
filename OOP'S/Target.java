public class Target{
    public static void main(String[] args) {
        int [] arr={2,7,11,15};
        int left=0;
        int right=arr.length-1;
        int target=9;
        while(left<right){
            if(arr[left]+arr[right]==target){
               System.out.println(left+1);
System.out.println(right+1);
break;
            }
            else if(arr[left]+arr[right] <target){
                left++;
            }
            else{
                right--;
            }

            }
        

        
    }
}