class Solution {
    public boolean isAnagram(String s, String t) {
    
    boolean isAnagram = true;
    if(s.length() != t.length()) return !isAnagram;

    int[] freq = new int[26];
    for(int i = 0; i < s.length(); i++){
        freq[s.charAt(i) -  'a'] = freq[s.charAt(i) - 'a'] + 1;
        freq[t.charAt(i) - 'a'] = freq[t.charAt(i) - 'a'] - 1;
    }

    for(int i = 0; i < freq.length; i++){
        if(freq[i] != 0){
            return !isAnagram;
        }
    }
 
 return isAnagram;

    }  
}
