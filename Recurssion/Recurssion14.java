public class Recurssion14{
    static int maxArr(int [] arr,int left,int max,int s){
        if(left>s){
            return max;
        }
        if(arr[left]>max){
            max=arr[left];
        }
        return maxArr( arr,left+1,max,s);
    }   
    public static void main(String[] args) {
        int [] arr={1,6,3,5,5};
        int left=0;
        int max=arr[0];
        int s=arr.length-1;
        System.out.println(maxArr(arr,left,max,s));
    }
}