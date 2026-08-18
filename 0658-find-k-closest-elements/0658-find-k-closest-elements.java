class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ans.add(arr[i]);
        }
        ans.sort((a, b) -> {
            int x1 = Math.abs(a - x);
            int x2 = Math.abs(b - x);
            if (x1 == x2) {
                return a - b;
            }
            return x1 - x2;
        });
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(ans.get(i));
        }
        Collections.sort(result);
        return result;
    }
}