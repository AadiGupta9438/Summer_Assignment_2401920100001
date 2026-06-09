class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(p.length() > s.length()) return res;
        int arrp[] = new int[26];
        int arrs[] = new int[26];
        for(int i = 0 ; i < p.length() ; i++){
            arrp[p.charAt(i) - 'a']++;
            arrs[s.charAt(i) - 'a']++;
        }
        if(Arrays.equals(arrp , arrs)){
            res.add(0);
        }
        for(int i = p.length() ; i < s.length() ; i++){
            arrs[s.charAt(i) - 'a']++;
            arrs[s.charAt(i - p.length()) - 'a']--;
            if(Arrays.equals(arrp , arrs)){
                res.add(i - p.length() + 1);
            }
        }
        return res;
    }
}