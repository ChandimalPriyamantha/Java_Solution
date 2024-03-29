class Solution {
    public String longestCommonPrefix(String[] strs) {
       
           if(strs == null || strs.length == 0) return "";
           String prefix = strs[0];
           for(String s : strs)
              while(s.indexOf(prefix) != 0)
                   prefix = prefix.substring(0, prefix.length() - 1);
              return prefix;
        
    }
    public static void main(String[] args){
        String strs[] = {"flower","flow","flight"};
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}