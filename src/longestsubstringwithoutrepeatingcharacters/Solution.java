package longestsubstringwithoutrepeatingcharacters;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int tempMax = 0;
        int maxLength = 0 ;
        for(int i = 0; i <= s.length()-1; i++){
            for(int j = i+1; j <= s.length()-1; j++){
                char c = s.charAt(j);
                String temp = s.substring(i,j);
                if(temp.length() == 1){
                    maxLength++;
                    continue;
                }else{
                    if(!temp.contains(""+c)){
                        maxLength++;
                    }
                    else{
                        tempMax = maxLength;
                        maxLength=0;
                    }
                }
            }
        }
        return maxLength;
    }
}
