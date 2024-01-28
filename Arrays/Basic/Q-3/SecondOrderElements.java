class SecondOrderElements {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {8, 5, 9, 10, 3};
        int[] result = solution.getSecondOrderElements(arr.length, arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}

//solution
class Solution {
    int[] getSecondOrderElements(int n, int []a) {
        int[] result = new int[2];
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i:a){
            // updating second largest number
            if(i>largest){
                result[0] = largest;
                largest = i;
            } else if(i>result[0] && i<largest){
                result[0] = i;
            }

            // updating second smallest number
            if(i<smallest){
                result[1] = smallest;
                smallest = i;
            } else if(i<result[1] && i>smallest){
                result[1] = i;
            }
        }
        return result;
    }
}