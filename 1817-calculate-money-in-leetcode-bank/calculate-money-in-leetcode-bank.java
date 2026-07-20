class Solution {
    public int totalMoney(int n) {
        int a = 0;
        int mon = 1;
        
        while(n > 0){
        
        int current =  mon;

         for(int i = 0 ; i < 7 && n > 0 ; i++){
            a += current;
            current++;
            n--; 
         }
               mon++;     

        }
        return a;
      
}
   

}