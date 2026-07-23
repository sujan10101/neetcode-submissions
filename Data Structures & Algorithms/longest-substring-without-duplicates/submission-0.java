class Solution {
    public int lengthOfLongestSubstring(String s) {
       
       HashSet<Character> h = new HashSet<>();

        int left = 0;
        int right = 0;

        int max = 0;

        while(right < s.length()){

            char c = s.charAt(right);
            if(h.contains(c)){
                h.remove(s.charAt(left));
                left++;
            }
            else {

                h.add(c);
                right++;
            }

            if(h.size() > max){
                max = h.size();
            }
            

        }

        return max;

    }
}
