class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer>m=new HashMap<>();
        int n=candyType.length, types=0;
        for(int i=0; i<n; i++){
            if(m.containsKey(candyType[i])==false) {
                m.put(candyType[i], 1);
                types++;
            }
        }
        if(types>n/2) return n/2;
        return types;
    }
}