class Solution {
public static boolean isAnagram(String s, String t) {
        boolean isAnagram = true;
        char[] charsOfS = s.toCharArray();
        char[] charsOfT = t.toCharArray();

        HashMap<Character,Integer> countMap = new HashMap<>();

        for(char c : charsOfS){
            int count = countMap.getOrDefault(c,0);
            count++;
            countMap.put(c,count);
        }

        for(char c : charsOfT){
            int count = countMap.getOrDefault(c,0);
            count--;
            countMap.put(c,count);
        }

        for(Integer value : countMap.values()){
            if(!value.equals(0)){
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
