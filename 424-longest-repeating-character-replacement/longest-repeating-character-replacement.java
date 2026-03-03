class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer>map=new HashMap<>();
        int n=s.length();
        int i=0,count=0,maxfreq=0;
        for(int j=0;j<n;j++)
        {
            char ch=s.charAt(j);
            // map.put(ch, map.getOrDefualt (ch,0)+1);
               map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq=Math.max(maxfreq,map.get(ch));
            while(j-i+1-maxfreq>k)
            {
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            count=Math.max(j-i+1, count);

        }
        return count;
    }
}