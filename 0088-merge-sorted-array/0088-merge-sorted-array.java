class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // If 2nd array has no element.
        if (n == 0)
            return;

        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        // compare and store larger element first from the end.
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If 2nd array has left some element after comparisons.
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        // No need to do same for 1st array bcz if 1st array has left some elements, 
        // so that elements are already in sorted order and we have to store all sorted element in this array as well.
    }
}