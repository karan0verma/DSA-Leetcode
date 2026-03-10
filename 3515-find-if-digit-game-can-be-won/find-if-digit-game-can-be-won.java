class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int twoDigit =0;
        for(int num:nums){
            if(num>=0 && num <=9){
                single+= num;
            }
            else{
                twoDigit+=num;
            }
        }
        return single != twoDigit;
    }
}