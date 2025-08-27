class Solution {
public:
    int maxSubarraySumCircular(vector<int>& nums) {
     int maxSum = INT_MIN, minSum = INT_MAX, totalSum = 0, n = nums.size();

        // Kadane's for maximum subarray sum
        for (int i = 0, curr = 0; i < n; i++) {
            curr += nums[i];
            maxSum = max(maxSum, curr);
            if (curr < 0) curr = 0;
        }

        // Kadane's for minimum subarray sum
        for (int i = 0, curr = 0; i < n; i++) {
            curr += nums[i];
            totalSum += nums[i];
            minSum = min(minSum, curr);
            if (curr > 0) curr = 0;
        }

        int circularSum = totalSum - minSum;

        // If all numbers are negative, return maxSum
        if (circularSum == 0) {
            return maxSum;
        }

        return max(circularSum, maxSum);
    }
};   