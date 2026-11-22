class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int last=numbers.length-1;
        int start=0;
        while(start!=last) {
            int sum=numbers[start];
            sum+=numbers[last];
            if(sum==target) {
                return new int[]{start+1,last+1};
            }
            else if(sum>=target) {
                last--;
            }
            else {
                start++;
            }
        }
        return new int[]{};
    }
}