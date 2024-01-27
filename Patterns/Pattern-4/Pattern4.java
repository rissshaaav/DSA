public class Pattern4 {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printTriangle(5);
    }
}

//solution
class Solution {
    void printTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
        }
    }
}