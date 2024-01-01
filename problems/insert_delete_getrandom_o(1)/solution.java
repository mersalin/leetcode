class RandomizedSet {

    private final Set<Integer> set;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        this.set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
       if(set.contains(val)) {
            return false;
        }
        return set.add(val);
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!set.contains(val)) {
            return false;
        }
        return set.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int lower = 0;
        int upper = set.size();
        int r = (int) (Math.random() * (upper - lower)) + lower;
        List<Integer> list = new ArrayList<>(set);
        return list.get(r);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */