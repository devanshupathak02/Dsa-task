class Solution {
    public boolean judgeCircle(String moves) {
        int county=0;
        int countx=0;
        for(int i=0;i<moves.length();i++){

            if(moves.charAt(i)=='U'){
                county++;
            }else if(moves.charAt(i)=='D'){
                county--;
            }else if(moves.charAt(i)=='L'){
                countx++;
            }else{
                countx--;
            }
        }
        return (county==0 && countx==0);
    }
}