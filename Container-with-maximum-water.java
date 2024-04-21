class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int r = n-1;
        int max = 0;
        while(l<r){
            // Used to pointer one at the start of array and another at the ending of the array.
            int lh = height[l];
            int rh = height[r];
            int minh = Math.min(lh, rh); // we will change the position of the minimum one.
            max = Math.max(max, minh *(r-l)); // here max is the quatity of water.
            if(lh < rh){
                l++;
            }
            else{
                r--;
            }
        }
        return max;
    }
}