class Solution {
         public int trap(int[] height){
        int totalWater = 0;
        int left = 0;
        int right = height.length - 1;
        
        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        
        while(left <= right){
            leftMax = Math.max(leftMax,height[left]);
            rightMax = Math.max(rightMax,height[right]);
            if(rightMax < leftMax){
                totalWater+= rightMax - height[right];
                right--;
            }else {
                totalWater+= leftMax - height[left];
                left++;
            }
        }

        return totalWater;
    }
}
