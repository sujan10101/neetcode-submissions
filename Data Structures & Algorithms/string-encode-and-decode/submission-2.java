class Solution {

    public String encode(List<String> strs) {

        StringBuilder s = new StringBuilder();
            for(String str : strs){
                s.append(str.length()).append("#").append(str);
            }


            return s.toString();
    }

    public List<String> decode(String str) {
    //    char[] charArr = str.toCharArray();

    //         List<String> c = new ArrayList<>();

    //         StringBuilder st;
    //         for(int i = 0; i < charArr.length; i++){

    //             if(charArr[i] != '#'){
    //                 continue;
    //             }

    //             char c1 = charArr[i - 1];
    //            int u = i+1;
    //            int numericValue = Character.getNumericValue(c1) + u;
    //            st = new StringBuilder();
    //             while(u <  numericValue){
    //                 st.append(charArr[u]);
    //                 u++;
    //             }

    //             c.add(st.toString());

    //         }

    //     return c;

                List<String> res = new LinkedList<>();
            char[] charArr = str.toCharArray();
            for(int i = 0; i < charArr.length; i++){
                StringBuilder sb = new StringBuilder();
                while(charArr[i] != '#'){
                    sb.append(charArr[i++]);
                }
                i++;

                int numOfChars = Integer.valueOf(sb.toString());
                int end = i + numOfChars;
                sb = new StringBuilder();

                while(i < end){
                    sb.append(charArr[i++]);
                }
                i--;
               res.add(sb.toString());

            }

           return res;
            
    }
}
