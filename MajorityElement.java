// https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0]; // Initialize the majority element
        int count = 1; // Initialize the count of the majority element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
            }
        }

        return majority;
    }
}

/*
class Solution {
    public int majorityElement(int[] nums) {
        int counter = 0; int tmp=nums[0];
        for(int i = 1; i< nums.length; i++){
            tmp = nums[i];
            if(nums[i] == nums[i-1]){
                counter++;
            }else {

            }
            tmp = nums[i];

        }
        return tmp;
    }
}
*/

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 
*/
