class Solution {
    public int numberOfSteps(int num) {
       return helper(num , 0);
    }
    static int helper(int val,int count){
        if(val==0){
            return count ;
        }
        if(val%2== 0){
            return helper(val/2,count+1);
        }else{
        return helper(val-1,count+1);
        }
    }
}