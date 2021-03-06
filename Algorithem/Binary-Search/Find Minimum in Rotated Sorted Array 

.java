Suppose a sorted array is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

 Notice

You may assume no duplicate exists in the array.

Have you met this question in a real interview? Yes
Example
Given [4, 5, 6, 7, 0, 1, 2] return 0

public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int size = nums.length;
        int start = 0;
        int end = size - 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[size - 1]){
                //not !! > nums[0]
                //有可能一直increase 没有rotated,这样第一个值是最小值
                start = mid;
            }else{
                end = mid;
            }

        }
        if(nums[start] < nums[end]){
            return nums[start];
        }else{
            return nums[end];
        }
    }
}
