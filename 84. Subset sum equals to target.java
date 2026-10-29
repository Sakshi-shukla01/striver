
class Solution {
    public boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][target + 1];

        // Target 0 is always possible: choose no elements
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int sum = 1; sum <= target; sum++) {

                // Do not pick current element
                dp[i][sum] = dp[i - 1][sum];

                // Pick current element if possible
                if (arr[i - 1] <= sum) {
                    dp[i][sum] = dp[i][sum]
                            || dp[i - 1][sum - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }
}
