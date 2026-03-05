class Solution {
    public int countKeyChanges(String s) {
        String newString=s.toLowerCase();
        int count =0;
        for(int i=1;i<newString.length();i++){
            if(newString.charAt(i)!=newString.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}