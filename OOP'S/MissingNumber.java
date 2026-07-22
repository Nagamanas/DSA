public class MissingNumber{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,6};
        int n=6;
        int sum=0;
      
        int sum2=0;
        int MissingNumber=0;
        for(int i=0;i<=n;i++){
           sum=sum+i;
        }
        for(int i=0;i<arr.length;i++){
          sum2=sum2+arr[i];
        }
        MissingNumber=sum -sum2;
        System.out.println(MissingNumber);
    }
}