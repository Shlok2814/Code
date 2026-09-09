class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long lowerBound = 1000;    
        while (n >= lowerBound) {
            commas += (n - lowerBound + 1);
            lowerBound *= 1000;
        }     
        return commas;
    }
}