class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String ans = sb.toString();
        int i = 0;
        int j = ans.length() - 1;
        while(i < j){
            if(ans.charAt(i) != ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}