public class Linearsearch1 {

public static void main(String[] args) {
    int arr[]={2,1,4,1};
    int first=-1;
    int last=-1;
    int val=1;
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==val){
            first=i;
            count++;

            break;
        }
    }
    for(int i=count;i<arr.length;i++){
        if(arr[i]==val){
            last=i;
        }
   
    }
    System.out.println(first);
    System.out.println(last);

}
}