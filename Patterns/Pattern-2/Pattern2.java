public class Pattern2 {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printTriangle(5);
    }
}

//solution
class Solution {
    void printTriangle(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}