class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        String sb="";

        for(int i=0;i<patterns.length;i++){
            sb=patterns[i];
            if(word.indexOf(sb)>=0){ 
                count++;
            }
        }
        return count;
    }
}