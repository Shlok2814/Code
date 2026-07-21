class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l=0;
        int e= s.length()-1;
        while(l<e){
            if(s.charAt(l)!=s.charAt(e)){
                return false;
            }
          l++;
          e--;
        }
        return true;
    }
}