class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0 ;
        for(char a : s.toCharArray()){
            if(a =='('){
                count++;
                max = Math.max(max,count);
            }
            else if(a == ')'){
                count--;
            }
        }
        return max;
        
    }
}