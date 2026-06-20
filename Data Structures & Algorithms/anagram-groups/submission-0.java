class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> map = new HashMap<>();
      for(int i = 0; i < strs.length; i++)
      {
       String s = strs[i];

       int[] newArr = new int[26];

       for(int k = 0 ; k < s.length(); k++){
         newArr[s.charAt(k) - 'a']++;
       }

       StringBuilder strb = new StringBuilder();

       for(int j = 0; j < newArr.length; j++){
        strb.append(newArr[j]).append("#");
       }

       String key = strb.toString();
       map.putIfAbsent(key, new ArrayList<>());
       map.get(key).add(s);

      }

      return new ArrayList<>(map.values());


    }
}
