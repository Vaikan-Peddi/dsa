class Solution {
    public int balancedStringSplit(String s) {
        int countR=0, countL=0, count=0;
        for(char c: s.toCharArray()){
            if(c=='R')countR++;
            else countL++;
            if (countR==countL)count++;
        }
        return count;
    }
}
