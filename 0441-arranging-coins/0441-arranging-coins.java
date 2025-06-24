class Solution {
    public int arrangeCoins(int n) {
       int s=1;
       int e=n;
     //   1 2 3 4 5 6 7 8 9
        while(s <= e){
            long mid= s + (e-s)/2;
            long sum= mid *(mid+1)/2 ;//sum of k element

            if(sum== n){
                return (int)mid;
            }
            else if(sum >n){
                e=(int)mid-1;
            }else{
                s=(int)mid+1;
            }
        }
        return e;
    }
}