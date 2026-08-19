class Solution {
    public int lengthOfLongestSubstring(String s) {
    //    HashSet<Character> finals = new HashSet<>();
        int sol = 0;
        for(int i = 0; i<s.length(); i ++){
            HashSet<Character> dupc = new HashSet<>();
            int add = 0;
            for(int  j = i; j<s.length(); j++){
                char c = s.charAt(j);
                 if (!dupc.contains(c)) {
                    dupc.add(c);
                    add += 1;
                }else{
                    break;
                }
            }
            if(sol<add){
                sol = add;
                // finals = dupc;
            }
        }

        return sol;
    }
}