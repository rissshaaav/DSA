class LeftRotate {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {8, 5, 9, 10, 3};
        int[] result = solution.rotateArray(arr, arr.length);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}

//solution
class Solution {
    int[] rotateArray(int[] arr, int n) {
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
}