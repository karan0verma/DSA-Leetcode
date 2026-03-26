class Solution {
    public static void reverseString(char[] s){
      Solve(0, s.length - 1, s);
    }
    public static void Solve(int i, int j ,char[] s) {
        if(i>=j) return;
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            Solve(i+1,j-1,s);
    }
}