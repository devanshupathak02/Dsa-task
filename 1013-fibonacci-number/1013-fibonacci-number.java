class Solution {
    public int fib(int n) {
        
        return (int) Math.round((Math.pow(((1+Math.sqrt(5)) / 2 ), n) / Math.sqrt(5)));
    }
}