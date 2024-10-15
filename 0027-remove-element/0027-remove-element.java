class Solution {
    public int removeElement(int[] nums, int val) {
       int n = nums.length;
        int index = 0; // This will point to the next position to place a non-val element.
        
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        
        // Print the modified array
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i] + " ");
        }
        
        // Return the new length of the array
        return index;
    }
}