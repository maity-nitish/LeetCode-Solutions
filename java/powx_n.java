// ======================================
// LeetCode Problem: powx n
// Language: java
// Link: https://leetcode.com/problems/powx-n/
// Synced by: LinkCode
// Date: 9/14/2026, 7:25:29 PM
// ======================================


class Solution {
    public double myPow(double x, long n) {
        // if(n==0){
        //     return 1;
        // }
        // if(n<0){
        //     x=1/x;
        //     n=Math.abs(n);
        // }
        // return x*myPow(x,n-1);

        if(n<0){
            x=1/x;
            n=-n;
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n%2==0){
            double p=myPow(x,n/2);
            x=p*p;
        }else{
            double p=myPow(x,(n-1)/2);
            x=p*p*x;
        }
        return x;
    }
}