package longestpalindromicsubstring;

public class Solution {
    public String longestPalindrome(String s) {

        System.out.println(isPalindrome(s));

        return "";
    }

    public boolean isPalindrome(String s){
        boolean isPalindrome = false;
        if(s.length() == 1){
            isPalindrome = true;
        }else{
            int i = s.length() / 2;
            int j;
            if(s.length() % 2 == 0){
                j = i-1;
                isPalindrome = isWordPalindrome(s, isPalindrome, i, j);
            }else{
                j = i-1;
                i = i+1;
                isPalindrome = isWordPalindrome(s, isPalindrome, i, j);
            }
        }
        return isPalindrome;
    }

    private boolean isWordPalindrome(String s, boolean isPalindrome, int i, int j) {
        while(j >= 0 && i<s.length()){
            if(s.charAt(j) == s.charAt(i)){
                isPalindrome = true;
            }else{
                isPalindrome = false;
            }
            j--;
            i++;
        }
        return isPalindrome;
    }

}
