class Solution 
{
    public List<List<Integer>> findWinners(int[][] matches) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int[] arr : matches)
        {
            set.add(arr[0]);
            if(map.containsKey(arr[1])){ map.put(arr[1],map.get(arr[1])+1); }
            else{ map.put(arr[1],1); }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int a = entry.getKey();
            int b = entry.getValue();
            if(b==1){ ans.get(1).add(a); }
        }
        
        for(int i : set)
        {
            if(!map.containsKey(i)){ ans.get(0).add(i); }
        }
        
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        
        return ans;
        
    }
}
