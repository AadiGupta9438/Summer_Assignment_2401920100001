class Solution {
    public String longestCommonPrefix(String[] arr) {
        String word = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            char ch = word.charAt(i);
            for(int j = 1 ; j < arr.length ; j++){
                if(i >= arr[j].length() || arr[j].charAt(i) != ch){
                    return word.substring(0 , i);
                }
            }
        }
        return word;
    }
}