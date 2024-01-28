class CheckSortedArray {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {8, 5, 9, 10, 3};
        int result = solution.isSorted(arr, arr.length);
        System.out.println(result);
    }
}

//solution
class Solution {
    int isSorted(int []a, int n) {
        boolean isSorted = true;
        for(int i=0; i<n-1; i++){
            if(a[i]>a[i+1]){
                isSorted = false;
            }
        }
        if(isSorted){
            return 1;
        }
        return 0;
    }
}