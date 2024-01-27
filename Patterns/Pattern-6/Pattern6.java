public class Pattern6 {
    // Driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.printTriangle(2);
    }
}

//solution
class Solution {
    void printTriangle(int n) {
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}