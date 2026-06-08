class Solution {
    public boolean canConstruct(String ransomnote, String magazine) {
        for(char c : ransomnote.toCharArray()){
            int i = magazine.indexOf(c);
            if(i == -1) return false;
            magazine = magazine.substring(0 , i) + magazine.substring(i + 1);
        }
        return true;
    }
}