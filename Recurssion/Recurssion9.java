public class Recurssion9{
    static void reverse(char[] s,int left,int right){
        if(left>=right){
            return;
        }
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        reverse(s, left+1, right-1);
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int left=0;
        int right=s.length-1;
       reverse( s,  left,  right);
       System.out.println(s);

    }
}