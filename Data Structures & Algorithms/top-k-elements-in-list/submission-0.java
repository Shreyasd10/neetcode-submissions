class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num : nums) {
            int count = frequency.getOrDefault(num, 0);
            count++;
            frequency.put(num, count);
        }


        int[] result = new int[k];

        List<Integer>[] buckets = new List[nums.length + 1];
        for ( int key : frequency.keySet()){
            int count = frequency.get(key);
            if(buckets[count] == null){
                buckets[count] = new ArrayList<>();
            }
            buckets[count].add(key);
        }

        int counter = 0;

        for(int i = buckets.length - 1 ; i>=0 && counter < k; i--){
            if(buckets[i] !=null){
                for(int value : buckets[i]) {
                    result[counter++] = value;
                }
            }
        }
        return  result;
    }
    }
