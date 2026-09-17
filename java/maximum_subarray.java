// ======================================
// LeetCode Problem: maximum subarray
// Language: java
// Link: https://leetcode.com/problems/maximum-subarray/
// Synced by: LinkCode
// Date: 9/17/2026, 7:36:05 PM
// ======================================


class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int ms=nums[0];
        for(int i=1;i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(cs,ms);
        }
        return ms;
    }
}