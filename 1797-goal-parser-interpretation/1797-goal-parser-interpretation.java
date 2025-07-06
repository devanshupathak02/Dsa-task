class Solution {
    public String interpret(String command) {
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<=command.length();i++){
            char ch= command.charAt(i-1);
            if(ch=='G'){
                sb.append("G");
            }else if(ch=='('){
                if(command.charAt(i)==')'){
                    sb.append("o");
                   i= i+1;
                }else{
                    sb.append("al");
                   i= i+3;
                }
            }
        }
        return sb.toString();
    }
}