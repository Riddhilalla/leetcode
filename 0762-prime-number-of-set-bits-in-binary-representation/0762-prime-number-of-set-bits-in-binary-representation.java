class Solution {
    public int countPrimeSetBits(int left, int right) {
        int prime =0;
       
            for(int i=left;i<=right; i++){
                if(Isprime(Integer.bitCount(i))){
                    prime++;
                }
            }
          
        
        return prime;
    }
    public static boolean Isprime(int num){
       if (num < 2) return false;
        for (int j = 2; j * j <= num; j++) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}