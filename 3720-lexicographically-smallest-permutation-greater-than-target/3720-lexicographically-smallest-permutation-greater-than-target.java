class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt = new int[26];
        int mask = 0, bad = 0;
        for (char ch : s.toCharArray()) cnt[ch - 'a']++;
        for (char ch : target.toCharArray()) cnt[ch - 'a']--;
        for (int c = 0; c < 26; c++) {
            if (cnt[c] < 0) bad++;
            else if (cnt[c] > 0) mask |= 1 << c;
        }
        for (int i = target.length() - 1; i >= 0; i--) {
            int cur = target.charAt(i) - 'a';
            cnt[cur]++;
            if (cnt[cur] == 0) bad--;
            else if (cnt[cur] == 1) mask |= 1 << cur;
            if (bad > 0) continue;
            int higher = mask >>> (cur + 1);
            if (higher == 0) continue;
            int next = cur + 1 + Integer.numberOfTrailingZeros(higher);
            cnt[next]--;
            StringBuilder ans = new StringBuilder(target.substring(0, i));
            ans.append((char) ('a' + next));
            for (int c = 0; c < 26; c++) {
                while (cnt[c]-- > 0) {
                    ans.append((char) ('a' + c));
                }
            }
            return ans.toString();
        }
        return "";
    }
}