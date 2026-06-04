class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        boolean duplicate = false;
        for(int i : nums){
            if(numSet.contains(i)){
                duplicate = true;
            }
            numSet.add(i);
        }
        return duplicate;
    }
}