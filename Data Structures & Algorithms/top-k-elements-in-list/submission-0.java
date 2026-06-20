class Solution {
    public int[] topKFrequent(int[] nums, int k) {

   HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> [] bucketList = new List[nums.length + 1];

        for(int key: map.keySet() ){
             int freq = map.get(key);
             if(bucketList[freq] == null){
                 bucketList[freq] = new ArrayList<>();
             }

             bucketList[freq].add(key);
        }

        int[] newArr = new int[k];
        int index = 0;
        for(int l = bucketList.length - 1; l >= 0; l--){

            if(bucketList[l] == null){
                continue;
            }

            for(int m = 0 ; m < bucketList[l].size() && index < k; m++){
                newArr[index] = bucketList[l].get(m);
                index++;
            }


        }
        
        return newArr;


    }
}
