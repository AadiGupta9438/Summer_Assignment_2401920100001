class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> str = new Stack<>();
        String ans = "";
        int num = 0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                num = num * 10 + (c - '0');
            } else if(c == '['){
                count.push(num);
                str.push(ans);
                num = 0;
                ans = "";
            } else if(c == ']'){
                int r = count.pop();
                String st = str.pop();
                while(r-- > 0){
                    st += ans;
                }
                ans = st;
            } else {
                ans += c;
            }
        }
        return ans;
    }
}