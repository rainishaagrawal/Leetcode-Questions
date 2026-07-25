class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayList<Integer> stud = new ArrayList<>();
        ArrayList<Integer> sand = new ArrayList<>();
        for (int s : students) {
            stud.add(s);
        }
        for (int s : sandwiches) {
            sand.add(s);
        }
        int count = 0;
        while (!stud.isEmpty() && count < stud.size()) {
            if (stud.get(0).equals(sand.get(0))) {
                stud.remove(0);
                sand.remove(0);
                count = 0;
            } else {
                stud.add(stud.remove(0));
                count++;
            }
        }
        return stud.size();
    }
}