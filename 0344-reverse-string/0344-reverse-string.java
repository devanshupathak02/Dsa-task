class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
        // h e l l o;
    }
    static void reverse(char [] s,int start,int end){

        if(start > end){
            return;
        }
       
       char temp = s[start];
       s[start]=s[end];
       s[end]=temp;
        reverse(s,start+1,end-1);
        
    }
}