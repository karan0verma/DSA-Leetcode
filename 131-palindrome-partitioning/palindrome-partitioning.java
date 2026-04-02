class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        Solve(0, s, new ArrayList<>(), ans);
        return ans;
    }
    public void Solve(int i, String s, List<String>temp, List<List<String>> ans){
        if(i==s.length()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                temp.add(s.substring(i,j+1));
                Solve(j+1,s, temp, ans);
                temp.remove(temp.size()-1);
            }
        }
    }
     public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
  