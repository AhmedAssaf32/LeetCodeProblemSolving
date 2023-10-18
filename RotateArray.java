// https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public void rotate(int[] nums, int k) {

        int tmp=0, n=nums.length; //i=0,
         k = k % n; // To handle cases where k is greater than the length of the array
         if (k < 0) {
            k = n + k; // Convert negative k to its positive equivalent
        }
        
        /*the following code is my first solution*/  

        //for(int i = 0; i < nums.length; i++){
        //int i = 0;
        /*while(i < nums.length){
            if(k>0){
                tmp=nums[i];
                nums[i]=nums[k];
                nums[k]=tmp;
                //k--;
            }
            i++;
            k--;
            
        }*/

        /*end of my first solution*/
        

    /*the following code is chatgpt solution*/ 
    /*int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }*/
    /*end of chatgpt solution*/ 

    /*the following is leetcode solution*/

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
        /*
        reverseNum(nums,0,n-1);
        reverseNum(nums,0,k-1);
        reverseNum(nums,k,n-1);
        */

    }


public static void reverse(int nums[], int i, int j){

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            
            i++;
            j--;
        }
    }

    /*end of leetcode solution*/
}


/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
*/
