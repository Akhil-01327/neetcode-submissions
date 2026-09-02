class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            while(set.contains(String.valueOf(s.charAt(i)))){
                set.remove(String.valueOf(s.charAt(l)));
                l++;
            }
            set.add(String.valueOf(s.charAt(i)));
            if(i-l+1>max){
                max = i-l+1;
            }
        }
        return max;
    }
}
