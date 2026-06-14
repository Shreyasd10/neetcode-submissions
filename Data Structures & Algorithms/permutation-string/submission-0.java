class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] target = new int[26];
        int[] window = new int[26];

        for(char c : s1.toCharArray()){
            target[c - 'a']++;
        }

        int left = 0;
        int right = 0;

        while(right < s2.length()){
            char currentLetter = s2.charAt(right);
            window[currentLetter - 'a']++;

            if(right - left + 1 > s1.length()){
                window[s2.charAt(left) - 'a']--;
                left++;
            }


            if(right - left + 1 == s1.length()){
                if(Arrays.equals(target,window)){
                    return true;
                }
            }
            right++;
        }
        return false;
    }
}
