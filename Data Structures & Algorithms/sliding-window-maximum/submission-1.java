class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        int[] result = new int[n-k+1];

        while(right < n){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[right]){
                dq.pollLast();
            }
            dq.offerLast(right);

            if(right - left + 1 == k){
                result[index++] = nums[dq.peekFirst()];
                
                left++;

                if(!dq.isEmpty() && dq.peekFirst() < left){
                    dq.pollFirst();
                }
            }
            right++;
        }
        return result;
    }
}
