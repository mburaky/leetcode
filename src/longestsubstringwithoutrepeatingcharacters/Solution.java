package longestsubstringwithoutrepeatingcharacters;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int tempMax = 0;
        int maxLength = 0 ;
        for(int i = 0; i <= s.length()-1; i++){
            for(int j = i+1; j <= s.length(); j++){
                char c = s.charAt(j-1);
                String temp = s.substring(i,j);
                if(temp.length() == 1){
                    maxLength = maxLength + 1;
                    continue;
                }else{
                    if(!s.substring(i,j-1).contains(""+c)){
                        maxLength = maxLength + 1;
                        if(maxLength == s.length()){
                            tempMax = maxLength;
                        }
                    }
                    else{
                        if(maxLength > tempMax) {
                            tempMax = maxLength;
                        }
                        maxLength=0;
                        break;
                    }
                }
            }
        }
        if(s.length() == 1){
            return 1;
        }

        return tempMax;
    }
}
