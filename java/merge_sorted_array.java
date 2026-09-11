// ======================================
// LeetCode Problem: merge sorted array
// Language: java
// Link: https://leetcode.com/problems/merge-sorted-array/
// Synced by: LinkCode
// Date: 9/11/2026, 11:50:34 AM
// ======================================


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        int a=0;
        int b=0;
        int i;
        for(i=0;i<m+n;i++){
            if(b==n || a==m){
                break;
            }
            if(nums1[a]<nums2[b]){
                arr[i]=(nums1[a]);
                a++;
            }
            else{
                arr[i]=(nums2[b]);
                b++;
            }
        }
        if(a!=m){
            while(a!=m){
                arr[i]=(nums1[a]);
                a++;
                i++;
            }
        }
        if(b!=n){
            while(b!=n){
                arr[i]=(nums2[b]);
                b++;
                i++;
            }
        }
        for(i=0;i<arr.length/2;i++){
            nums1[i]=arr[i];
            nums1[arr.length-i-1]=arr[arr.length-i-1];
        }
        if(arr.length%2!=0){
                nums1[(arr.length/2)]=arr[(arr.length/2)];
        }
    }
}