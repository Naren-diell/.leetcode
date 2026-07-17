class Solution {
    public int[] distributeCandies(int c, int p) {
        int[] arr = new int[p];
        int i = 0;

        while(c>0){
            if((i+1)<c){
            arr[i%p] += i+1;
            c=c-(i+1);
            i++;
            }
            else{
                arr[i%p] += c;
                c=0;
            }
        }
        return arr;
    } 
}