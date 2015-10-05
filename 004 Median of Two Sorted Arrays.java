public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k = nums1.length + nums2.length;
        if(k%2 ==1) {
            return find(nums1, 0, nums1.length, nums2, 0, nums2.length, (k+1)/2);
        } else {
            return (find(nums1, 0, nums1.length, nums2, 0, nums2.length, (k+1)/2)+find(nums1, 0, nums1.length, nums2, 0, nums2.length, (k+1)/2+1))/2;
        }
        
    }
    public double find(int[] nums1, int start1, int len1, int[] nums2, int start2, int len2, int k) {
        if(len1 > len2) {
            return find(nums2, start2, len2, nums1, start1, len1, k);
        }
        if(len1 == 0) {
            return nums2[start2+k-1];
        }
        if(k == 1) {
            return Math.min(nums1[start1], nums2[start2]);
        }
        int pa = Math.min(k/2, len1), pb = k-pa;
        if(nums1[start1+pa-1] < nums2[start2+pb-1]) {
            return find(nums1, start1+pa, len1-pa, nums2, start2, len2, k-pa);
        } else {
            return find(nums1, start1, len1, nums2, start2+pb, len2-pb, k-pb);
        } 
    }
}
