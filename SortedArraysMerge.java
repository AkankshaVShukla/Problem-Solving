//https://leetcode.com/problems/merge-sorted-array/description/
class SortedArraysMerge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int c=m+n-1;
        while(n>0 && m>0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[c]=nums2[n-1];
                n--;
            }else{
                nums1[c]=nums1[m-1];
                m--;
            }
            c--;
        }
        
        while(n>0){
            nums1[c--]=nums2[n-1];
            n--;
        }
    }
}
