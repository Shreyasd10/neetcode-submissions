class Solution {
     public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = cleaned.length() - 1;
        int start = 0;
        while(start <= end){
            if(cleaned.charAt(start) != cleaned.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
