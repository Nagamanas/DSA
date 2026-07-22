class Node{
    int val;
    Node next;


Node (){

}
Node(int val){
   this.val=val;
}
Node(int val,Node next){
    this.val=val;
    this.next=next;

}
}
public class ListNode{
    public static void main(String[] args){
    Node second  =new Node(20);
    Node first =new Node(10,second);
     Node temp = first;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
    
        }
    }
}