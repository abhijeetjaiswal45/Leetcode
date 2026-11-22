class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> firstIndex=new HashMap<>();
        firstIndex.put(0,-1);
        int sum=0;
        int maxLen=0;

        for(int i=0;i<nums.length;i++) {
            sum+=(nums[i]==0)? -1 : 1;

            if(firstIndex.containsKey(sum)) {
                maxLen=Math.max(maxLen,i-firstIndex.get(sum));
            }
            else {
                firstIndex.put(sum,i);
            }
        }
        return maxLen;
    }
}