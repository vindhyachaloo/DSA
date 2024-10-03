class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int rem;
        int a=x;
        while(a>0){
        rem=a%10;
        rev=(rev*10)+rem;
        a=a/10;}
        return x==rev;
    }
}