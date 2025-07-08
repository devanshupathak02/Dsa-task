class Solution {
    public int numOfStrings(String[] patterns, String word) {
          StringBuilder sb;
        
        int count=0;
        

        for(int i=0;i<patterns.length;i++){
            sb= new StringBuilder( patterns[i]);
            if(word.indexOf(sb.toString())>=0){ 
                count++;
            }
        }
        return count;
    }
}