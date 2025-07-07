class Solution {
    public boolean halvesAreAlike(String s) {
        
        String vow="aeiouAEIOU";
        int mid=s.length()/2 ,ans=0;
        for(int i=0,j=mid;i<mid && j<s.length();i++,j++){
            if(vow.indexOf(s.charAt(i)) >=0 ){
                ans ++;
            } 
            if(vow.indexOf(s.charAt(j)) >=0 ){
                 ans --;
            }
        }
        return ans==0;
    }
}