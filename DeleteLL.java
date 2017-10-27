package akanksha.test.LeetCodePractice;

public class DeleteLL {
	
	public ListNode deleteLL(ListNode head, int target){
		ListNode current=head;
		ListNode prev = null;
		while(current!= null && current.val == target){
			prev=current;
			current=current.next;			
		}
		if(current!=null){
			prev.next=current.next;
			current.next=null;
		}
		return head;
	}
}
