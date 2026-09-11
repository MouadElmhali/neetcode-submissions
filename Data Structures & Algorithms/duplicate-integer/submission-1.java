class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet <Integer> uniqueList = new HashSet<Integer>();
           for (int i = 0; i < nums.length; i++) {
            if(uniqueList.contains(nums[i])){
                return true;
            }
            uniqueList.add(nums[i]);
        }
        return false;
    }
}