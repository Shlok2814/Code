class Solution {
    public ArrayList<Integer> findMissingElements(int[] arr) {
        ArrayList<Integer> missing= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:arr){
            set.add(n);
            if(n<min) min=n;
            if(n>max) max=n;
        }
        for(int i=min; i<max; i++){
            if(!set.contains(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}