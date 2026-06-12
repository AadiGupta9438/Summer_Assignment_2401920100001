class Solution {
    public int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        while(i < chars.length){
            char ch = chars[i];
            int j = 0;
            while(i < chars.length && chars[i] == ch){
                j++;
                i++;
            }
            chars[idx++] = ch;
            if(j > 1){
                String s = String.valueOf(j);
                for(char c : s.toCharArray()){
                    chars[idx++] = c;
                }
            }
        }
        return idx;
    }
}