class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()) return false;
        StringBuilder sb=new StringBuilder(t);
        for(int i=0; i<s.length(); i++){
            boolean matched= false;
            for(int j=0; j<sb.length(); j++){
            if(s.charAt(i)==sb.charAt(j)){
               sb.deleteCharAt(j);
               matched= true;
               break;
            } 
            }
             if(!matched) return false;
            }
        
        return true;
    }
}