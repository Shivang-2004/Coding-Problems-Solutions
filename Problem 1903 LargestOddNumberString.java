class Solution {
    public String largestOddNumber(String num) {
        int a = num.length();
        for(int len=a-1; len>=0; len--){
            if(num.charAt(len) % 2 != 0){
                String s = num.substring(0,len+1);
                return s;
            }
        }
        return "";
    }
}