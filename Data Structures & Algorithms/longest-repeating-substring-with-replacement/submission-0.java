class Solution {
    public int characterReplacement(String s, int k) {
        //AAABABBABAAAAAAAAA

        int[] count = new int[26];
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int maxFreq = 0;

        while(right < s.length()){
            char currentLetter = s.charAt(right);
            count[currentLetter - 'A']++;
            int freq = count[currentLetter - 'A'];
            maxFreq = Math.max(maxFreq,freq);

            int windowLength = right - left + 1;
            int replacements = windowLength - maxFreq;
            while(replacements > k){
                count[s.charAt(left) - 'A']--;
                left++;
                windowLength = right - left + 1;
                replacements = windowLength - maxFreq;
            }

            maxLength = Math.max(maxLength,windowLength);
            right++;
        }
        return maxLength;
    }
}
