/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node dummy = head;
        Stack<Node> st = new Stack<>();
        while(head != null){
            if(head.child != null){
                if(head.next!=null){
                    st.add(head.next);
                }
                head.next = head.child;
                head.child.prev=head;
                head.child=null;
            }
            else if(head.next==null && !st.isEmpty()){
                Node nn=st.pop();
                head.next=nn;
                nn.prev=head;
            }
            head = head.next; 
        }
        while(!st.isEmpty()){
            Node last= st.pop();
            while(last != null){
                System.out.print(last.val + " ");
                last = last.next;
            }
        }
        return dummy;
    }
}