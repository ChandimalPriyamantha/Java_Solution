class Solution {
    public boolean isPalindrome(int x) {
        int num = x, revers = 0;

        while(num != 0){

            int digit = num % 10;
            revers = revers * 10 + digit;

            num = num / 10;
        }

        if(x < 0){
            return false;
        }else if(revers == x) {
            return true;
        }else{
            return false;
        }
    }
}