// ======================================
// LeetCode Problem: majority element
// Language: java
// Link: https://leetcode.com/problems/majority-element/
// Synced by: LinkCode
// Date: 9/11/2026, 9:49:45 AM
// ======================================


class Solution {
    public int majorityElement(int[] nums) {
        int x=0;
        int count=0;
        for(int num:nums){
            if(count==0){
                x=num;
            }
            if(num==x){
                count++;
            }else{
                count--;
            }
        }
        return x;
    }
}