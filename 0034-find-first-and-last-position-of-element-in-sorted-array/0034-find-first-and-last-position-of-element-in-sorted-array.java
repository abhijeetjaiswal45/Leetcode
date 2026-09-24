class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};

        result[0]=firstNumber(nums,target);
        if(result[0]==-1){
            return result;
        }
        result[1]=secondNumber(nums, target);
        if(result[1]==-1){
            return result;
        }
        return result;
    }

        private int firstNumber(int[] arr,int target) {
            int start=0;
            int index=-1;
            int end=arr.length-1;
            while(start<=end) {
                int mid = start + (end-start) / 2;
                if(target>arr[mid]) {
                    start=mid+1;
                }
                else if(target<arr[mid]) {
                    end=mid-1;
                }
                else{
                    arr[mid]=target;
                    index =mid;
                    end=mid-1;
                }
            }
            return index;
        }

        private int secondNumber(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;  // move right
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

        // private int secondNumber(int[] arr,int target) {
        //     int start=0;
        //     int end=arr.length-1;
        //     while(start<=end) {
        //         int mid=start+(end-start)/2;

        //     }
        // }
    }