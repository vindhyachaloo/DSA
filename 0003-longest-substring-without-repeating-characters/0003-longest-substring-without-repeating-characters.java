class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        /*HashMap<Character,Integer> uniq=new HashMap<>();
        int len=s.length();
        int start=0;
        int end=0;
        int i=0;
        int substring=0;
        int maxlen=0;
        while(i<len && start<len && end<len){
           uniq.put(s.charAt(i),uniq.getOrDefault(s.charAt(i),0)+1);
           int k=start;
           while(k<=end) {
            if(s.charAt(k)==1){
                substring++;
                end++;
                i++;
            }
            else{
                start++;
            }
           }
            maxlen=Math.max(substring,maxlen);
        }

        return maxlen;*/
       
        HashMap<Character, Integer> uniq = new HashMap<>();
        int start = 0, maxlen = 0;

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            uniq.put(ch, uniq.getOrDefault(ch, 0) + 1);

            while (uniq.get(ch) > 1) {
                char startChar = s.charAt(start);
                uniq.put(startChar, uniq.get(startChar) - 1);
                start++;
            }

            maxlen = Math.max(maxlen, end - start + 1);
        }

        return maxlen;
    }
}

  