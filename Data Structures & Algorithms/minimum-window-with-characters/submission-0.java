class Solution {
    public String minWindow(String s, String t) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        int[] target = new int[128];
        int[] window = new int[128];

        for(char c : t.toCharArray()){
            target[c]++;
        }

        for(right = 0 ;right<s.length(); right++){
            window[s.charAt(right)]++;

            while(contains(target,window)){
                if(right-left+1 < minLength){
                    minLength = right-left+1;
                    minStart = left;
                }
                window[s.charAt(left)]--;
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart,minStart + minLength);
    }

    public boolean contains(int[] target,int[] source){
        for(int i = 0 ; i<128; i++){
            if(target[i] > source[i]){
                return false;
            }
        }
        return true;
    }
}
