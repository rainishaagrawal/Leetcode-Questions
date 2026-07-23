class RecentCounter {
    ArrayList<Integer>q;
    public RecentCounter() {
        q = new ArrayList<>(); 
    }
    
    public int ping(int t) {
        q.add(t);
        while(!q.isEmpty() && q.get(0) < t-3000){
            q.remove(0);
        }
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */