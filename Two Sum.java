//Two Sum

/*class Solution {
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
}*/

/*another solutions*/
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] + nums[i] == target)
                return new int[] {i-1,i};
        }
        return null;
    }
}*/
/*class Solution {
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
}*/

class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map <Integer , Integer> newArr = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(newArr.containsKey(complement)){
                return new int[]{newArr.get(complement),i};
            }
            newArr.put(nums[i],i);
        }
        return null;

    }
}
    
