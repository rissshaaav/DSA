public class Pattern1 {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printSquare(5);
    }
}

//solution
class Solution {
    void printSquare(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}