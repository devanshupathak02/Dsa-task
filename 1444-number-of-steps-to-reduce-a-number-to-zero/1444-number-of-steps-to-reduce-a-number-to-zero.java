class Solution {
    public int numberOfSteps(int num) {
        int val=num;
        int count=0;
        while(val > 0){
            if(val%2==0){
                val=val/2;
                count++;
            }else{
                val=val-1;
                count++;
            }
        }
        return count;
    }
}