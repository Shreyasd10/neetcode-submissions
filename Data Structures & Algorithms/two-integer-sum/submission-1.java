class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <nums.length ; i++){
            int pair = target - nums[i];
            if(map.containsKey(pair)){
                result[0]=map.get(pair);
                result[1] = i;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
