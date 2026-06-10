class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> seen = new HashSet<>();
        int maxLength = 0;
    
        for(int i = 0;i< nums.length;i++){
            seen.add(nums[i]);
        }


        // check the number you are currently on if its a possible start or end
        //if the set contains a number which is one graeted than the current then it can be possible start if it has one less itself its not
        //if it has one less than itself then move fowward as it will be encountered afterwards
        //use the start then add the counter and see if that rumber is there in the set , update the current length if its there and update the counter

        for(int num : nums){
            if(seen.contains(num - 1)){
                continue;
            }
            int currentNum = num;
            int currentLength = 1;
            int counter =  1;
            while(seen.contains(currentNum + counter)){
                currentLength++;
                counter++;
            }
            maxLength = Math.max(currentLength,maxLength);
        }
        return maxLength;
    }
}
