class Linearsearch {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {8, 5, 9, 10, 3};
        int numToBeFound = 9;
        int result = solution.linearSearch(arr.length, numToBeFound, arr);
        System.out.println(result);
    }
}

//solution
class Solution {
    int linearSearch(int n, int num, int []arr){
        for(int i=0; i<n; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
}