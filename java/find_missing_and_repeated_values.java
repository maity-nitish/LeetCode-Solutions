// ======================================
// LeetCode Problem: find missing and repeated values
// Language: java
// Link: https://leetcode.com/problems/find-missing-and-repeated-values/
// Synced by: LinkCode
// Date: 9/11/2026, 11:46:00 AM
// ======================================


class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length*grid.length;
        int deg[]=new int[n];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                deg[grid[i][j]-1]++;
            }
        }
 
        int repeated=0;
        int missing=0;
        for(int i=0;i<n;i++){
            if(deg[i]==0){
                missing=i+1;
            }
            if(deg[i]>1){
                repeated=i+1;
            }
            if(missing>0 && repeated>0){
                break;
            }
        }
        return new int[] {repeated,missing};
    }
}