class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        var map1 = new HashMap<String, Integer>();
        IntStream.range(0, list1.length).forEach(i -> map1.put(list1[i], i));
        
        var result = new ArrayList<String>();
        int minSum = Integer.MAX_VALUE;
        
        for (int i = 0; i < list2.length; i++) {
            int sum = map1.getOrDefault(list2[i], 2000) + i;
            
            if (sum > minSum) 
                continue;
            else if (sum < minSum)
                result.clear();        
            
            result.add(list2[i]);
            minSum = sum;
        }
        return result.toArray(new String[] {});
    }
}
