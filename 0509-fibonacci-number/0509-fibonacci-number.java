class Solution {
    public int fib(int n) {
   int ans= fibhelper(n);
    return ans;
    }
    
    public int fibhelper(int n){
    if(n==0||n==1){
    return n;
    }
        
    int temp1=fibhelper(n-1);
    int temp2=fibhelper(n-2);
    return temp1+temp2;
    }
}