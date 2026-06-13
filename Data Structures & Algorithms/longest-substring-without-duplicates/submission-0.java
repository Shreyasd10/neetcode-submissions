class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < s.length()){
            Character currentLetter = s.charAt(right);
            if(!window.contains(currentLetter)){
                window.add(currentLetter);
                maxLength = Math.max(maxLength,right - left + 1);
                right++;
            }else{
                window.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
