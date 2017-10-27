package akanksha.test.LeetCodePractice;

public class ReverseList {
	public static ListNode reverseLL(ListNode head){
		if(head==null)return null;
		ListNode current = head;
		ListNode prev=null;
		while(current!=null){
			ListNode temp= current.next;
			current.next=prev;
			prev=current;
			current=temp;
		}
		return prev;
	}
}
