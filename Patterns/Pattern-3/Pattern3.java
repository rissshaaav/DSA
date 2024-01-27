public class Pattern3 {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printSquare(3);
    }
}

//solution
class Solution {
    void printSquare(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}