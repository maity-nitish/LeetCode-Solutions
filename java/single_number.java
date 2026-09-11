// ======================================
// LeetCode Problem: single number
// Language: java
// Link: https://leetcode.com/problems/single-number/
// Synced by: LinkCode
// Date: 9/11/2026, 12:03:36 PM
// ======================================


class Solution {
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int num:nums){
            unique^=num;
        }
        return unique;
    }
}