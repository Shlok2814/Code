class Solution {
    public boolean halvesAreAlike(String s) {
        int n= s.length();
        int vowel1=0;
        int vowel2=0;
        for(int i=0; i<n/2; i++){
            if(isVowel(s.charAt(i))){
                vowel1++;
            }
            if(isVowel(s.charAt(i+n/2))){
                vowel2++;          
            }
        }
        return vowel1==vowel2;
    }

    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}