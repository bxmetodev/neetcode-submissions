class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int [] arr = new int[k];

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
            (a,b)-> a.getValue()-b.getValue()
        );

        for(Map.Entry<Integer,Integer> it:map.entrySet()){
            pq.add(it);
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty()){
            arr[--k]=pq.poll().getKey();
        }

return arr;
        
    }
}
