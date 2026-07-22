public class Medium{
    public static void main(String[] args) {
       int [] arr={1,8,6,2,5,4,8,3,7};
        int left=0;
        int right=arr.length-1;
        int maxarea=0;
        while(left<right){
          int height=Math.min(arr[left],arr[right]);
          int width=right-left;

            int area=width*height;
            if(area>maxarea){
                maxarea=area;
            }
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println(maxarea);

    }
}