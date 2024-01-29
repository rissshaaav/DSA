class MaxConsecutiveOnes {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 1};
        int result = solution.findMaxConsecutiveOnes(arr);
            System.out.print(result);
    }
}

//solution
class Solution {
    int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i:nums){
            if(i==1){
                count++;
            } else{
                count=0;
            }
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
}