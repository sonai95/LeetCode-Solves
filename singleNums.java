
class singleNums {
    public int singleNumber(int[] nums) {
        TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) 
        { 
            Integer c = tmap.get(nums[i]); 
  
            // If this is first occurrence of element    
            if (tmap.get(nums[i]) == null) 
               tmap.put(nums[i], 1); 
  
            // If elements already exists in hash map 
            else
              tmap.put(nums[i], ++c); 
        } 
  
        // Print result 
        for (Map.Entry m:tmap.entrySet()) {
        	if(((Integer) m.getValue()).intValue() == 1) {
        		return ((Integer) m.getKey()).intValue();
        	}
        }
        return 0;
    }
}