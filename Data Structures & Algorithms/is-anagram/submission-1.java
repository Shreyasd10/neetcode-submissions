class Solution {
public static boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        int[] counts = new int[26];

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        for(int count : counts){
            if(count != 0){
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

}
