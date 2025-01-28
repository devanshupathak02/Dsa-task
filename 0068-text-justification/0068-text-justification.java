class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
    //words = ["This", "is", "an", "example", "of", "text", "justification."]
        List<String> ans = new ArrayList<>();
        int i=0;
        String line = new String();
        int spacePerHole =0;;
        int remaining =0;

        // _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ = 16
        // t h i s   i s   a n          

        // distribute 8 spaces evenly in 2 spaces(between words this/is & is/an). 
        // t h i s      i s    an

        // first word can always be taken
         
        


        while(i<words.length)
        {
            int usedCharLength = words[i].length();
            int j = i+1;
            int noOfHoles = 0;// holes is one space between two words
        
            // plus one because after selecting each word, we need atleast 1 space
            while(j < words.length && words[j].length()+1+usedCharLength+noOfHoles <=maxWidth)
            {
                usedCharLength+= words[j].length();
                noOfHoles++;
                j++;
            }
                int remainingSpaces = maxWidth - usedCharLength;
            // Now if remaining spaces is 8
            // and unFixedSpaces(holes) = 2. Means we need to disrtibute
            // 8 spaces in 2 holes which is 4 spaces each.
                spacePerHole = noOfHoles==0?0:remainingSpaces / noOfHoles;
                remaining = noOfHoles==0?0:remainingSpaces%noOfHoles; 
                
                // last line
                if(j == words.length)
                {
                    spacePerHole = 1;
                    remaining = 0;
                }

                //System.out.println("remainingSpaces" + remainingSpaces);
                //System.out.println("spacePerHole " + spacePerHole);
                //System.out.println("remaining " + remaining);
            // if not possible to evenly distribute, start adding 
            // those extra from left

                line = buildLine(i,j,spacePerHole,remaining,words,maxWidth,noOfHoles);
                //System.out.println("Line is -" + line);
                ans.add(line);
                i = j;

        }
        
        return ans;
    }

    public String buildLine(int i, int j, int spacePerHole, int remaining, String[] words, int maxWidth, int noOfHoles)
    {
        // represents each line
        String temp = new String();
        int curHoleCount=0;
        for(int k=i;k<j;k++)
        {
            temp+= words[k];
            // now add spaces per hole
            if(temp.length()>=maxWidth)
                break;
            for(int x=0;x<spacePerHole;x++)
            {
                temp+=" ";
            }
            // now add any remaining spaces filling from left evenly

            if(remaining > 0)
            {
                temp+=" ";
                remaining--;
            }
                
        }

        while(temp.length()<maxWidth)
            temp+=" ";


            return temp;



    }
}