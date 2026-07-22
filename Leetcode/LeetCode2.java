import java.util.Arrays;


public class LeetCode2{
    public static void main(String[] args) {
        int [] nums={1,0,2,3,4};
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k]=0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
      
    }
}