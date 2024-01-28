public class LargestElementInArray {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {8, 5, 9, 10, 3};
        int max = solution.largestElement(arr, arr.length);
        System.out.println(max);
    }
}

//solution
class Solution {
    int largestElement(int[] arr, int n) {
        int max = Integer. MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}