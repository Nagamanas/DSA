public class LeetCode4{
    public static void main(String[] args) {
        int count=0;
        int [] arr={2,1,2,3,2,4,2};
        int n=arr.length;
        for(int i=0;i<n; i++){
            for(int j=0;j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println(arr[i]);
                return ;
            }
            else{
                count=0;
            }
        }
    }
}