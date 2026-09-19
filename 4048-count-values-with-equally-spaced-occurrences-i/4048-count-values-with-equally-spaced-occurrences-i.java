class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for (int num : map.keySet()) {
            ArrayList<Integer> positions = map.get(num);
            if (positions.size() == 3) {
                int i1 = positions.get(0);
                int i2 = positions.get(1);
                int i3 = positions.get(2);
                if (i2 - i1 == i3 - i2) {
                    count++;
                }
            }
        }
        return count;
    }
}