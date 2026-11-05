class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        for(int i=0;i<arr1.length;i++) {
            boolean doubt=true;
            for(int j=0;j<arr2.length;j++) {
            int check=arr1[i]-arr2[j];
            if(check<0) {
                check=check*-1;
            }
                if(check <= d) {
                    doubt=false;
                    break;
                }
            }
            if(doubt) ans++;
        }
        return ans;
    }
}