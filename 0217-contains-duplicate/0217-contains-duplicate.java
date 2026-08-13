class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : nums){
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for(int x: nums){
            if(map.get(x) > 1){
                return true;
            }
        }
        return false;
    }
}