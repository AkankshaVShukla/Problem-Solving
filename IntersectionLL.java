package akanksha.test.LeetCodePractice;

public class IntersectionLL {
	public ListNode intersection(ListNode l1, ListNode l2){
		int len1=0, len2=0;
		ListNode list1 = l1;
		while(list1.next!=null){
			len1++;
			list1=list1.next;
		}
		ListNode list2 = l2;
		while(list2.next!=null){
			len2++;
			list2=list2.next;
		}
		if(len1>len2){
			list1=trim(l1, len1-len2);
		}else if(len1<len2){
			list2=trim(l2, len2-len1);
		}
		while(list1.val != list2.val){
			list1=list1.next;
			list2=list2.next;
		}
		return list1;
		
		
	}
}
