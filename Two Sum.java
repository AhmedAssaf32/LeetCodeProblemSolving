//Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //int [] res;
        for(int i = 0; i< nums.length;i++){
            for(int j = i+1; j< nums.length;j++){
              if(nums[i] + nums[j] == target){
                //res[] = {i,j};
                //return res;
                return new int[] { i, j };
                //return new int[] { i, i+1 };
             }
            }
        }
        return null;
    }
}
