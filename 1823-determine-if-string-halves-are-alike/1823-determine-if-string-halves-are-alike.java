class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int count1=0;
        int count2=0;
        int length=(s.length())/2;
        for(int i=0,j=length;i<length && j<s.length()+1;i++,j++){
            char ch1= s.charAt(i);
            char ch2=s.charAt(j);
            if(ch1=='a'|| ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                count1++;
            }
            if(ch2=='a'|| ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'||ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U'){
                count2++;
            }
            sb1.append(ch1);

            sb2.append(ch2);
            
        }
        if(count1==count2){
                return true;
            }
    return false;
        
    }
}