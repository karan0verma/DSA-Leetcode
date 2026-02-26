class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set= new HashSet<>(); 
        int i=0,j=0,count=0;
        int n=s.length();     
        while(i<=j && j<n){
            if(!set.contains(s.charAt(j)))
            {
                  set.add(s.charAt(j));
                  count=Math.max(j-i+1,count);
                j++;
            }
            else {
                  set.remove(s.charAt(i));
                i++;
            }
        //     set.add(s.charAt(j));
        }  
        return count;
    }
}