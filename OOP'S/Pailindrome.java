public class Pailindrome{
    public static void main(String[] args) {
        String s="ABCA";
        int right=s.length()-1;
        int left=0;
        boolean palindrome=true;
    
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
            

        }
        if(palindrome){
            System.out.println("The string is palindrome");
        }
        else{
              System.out.println("The string is not  palindrome");
        }

    }
}