class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        // Largest element that can contained by nums1 and nums2.
        int[] nextGreater = new int [10001];

        for(int i=nums2.length-1; i>=0; i--) {

            while(!stack.isEmpty() && nums2[i] >= stack.peek()) {
                stack.pop();
            }
            nextGreater[nums2[i]] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums2[i]);
        }

        for(int i=0; i<nums1.length; i++) {
            nums1[i] = nextGreater[nums1[i]];
        }

        return nums1;
    }
}