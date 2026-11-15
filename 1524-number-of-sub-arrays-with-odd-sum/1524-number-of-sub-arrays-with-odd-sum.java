class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD = 1000000007;
        long count = 0;
        int prefixSum = 0;

        int evenCount = 1; 
        int oddCount = 0;
        
        for (int num : arr) {
            prefixSum += num;
            
            if (prefixSum % 2 == 0) {
                count = (count + oddCount) % MOD;
                evenCount++;
            } else {
                count = (count + evenCount) % MOD;
                oddCount++;
            }
        }
        
        return (int) count;
    }
}