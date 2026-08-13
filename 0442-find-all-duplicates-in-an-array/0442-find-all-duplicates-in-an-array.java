class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : nums) {
            if (map.get(x) == 2) {
                ans.add(x);
                map.put(x, 0); 
            }
        }
        return ans;
    }
}