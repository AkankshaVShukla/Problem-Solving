package akanksha.test.LeetCodePractice;

public class MinElementRotatedSortedArray {

	public int findMin(int a[]){
		if (a == null || a.length == 0) {
            return 0;
        }
		int left=0;
		int right=a.length-1;
		int mid=0;
		while(left<right){
			mid=(left+right)/2;
			if(a[mid]<a[right]){
				right=mid;
			}else if(a[mid]>a[right]){
				left=mid+1;
			}
		}
		return a[left];
	}
}
