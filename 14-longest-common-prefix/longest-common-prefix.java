class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pattern = strs[0];


        for(int i=0; i<strs.length; i++){
            if(i+1 >= strs.length){
                break;
            }
            if(strs[i+1].isEmpty()){
                return "";
            }
            if(!strs[i].startsWith(strs[i+1].substring(0,1))){
                return "";
            }
            while(pattern.startsWith(strs[i+1].substring(0,1))){
                if(pattern.equals(strs[i+1])){
                    break;
                }else if(pattern.length() <= strs[i+1].length()){
                    if(strs[i+1].substring(0, pattern.length()).equals(pattern)){
                        break;
                    }
                }
                pattern = pattern.substring(0, pattern.length()-1);
                // System.out.println(pattern);
            }
        }
            return pattern;

    }
}