
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

public class RotateList {
	public ListNode rotateListRight(ListNode head, int n){
		if(head==null || head.next==null){
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.next=head;
		ListNode slow=dummy, fast=dummy;
		
		int length;
		for(length=0; fast.next!=null; length++){
			fast=fast.next;
		}
		for(int j=length-n%length; j>=0;j--){
			slow=slow.next;
		}
		fast.next=dummy.next;
		dummy.next=slow.next;
		slow.next=null;
		
		return dummy.next;
	}
}
