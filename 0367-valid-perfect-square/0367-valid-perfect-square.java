class Solution {
    public boolean isPerfectSquare(int num) {
        
    long s=1;
    long e=num;

    while(s <= e){
        long mid= s +(e-s)/2;
        long square = mid*mid;
        if(square == num){
            return true;
        }
        else if(square > num){
            e=mid-1;
        }else{
            s=mid+1;
        }
    }
    return false;
    }
    
}