class Solution {
    public String longestCommonPrefix(String[] strs) {

        String s = strs[0];
        String res = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = 1; j < strs.length; j++) {

                String s2 = strs[j];

                if (i >= s2.length() || s.charAt(i) != s2.charAt(i)) {
                    return res;
                }
            }

            res += s.charAt(i);
        }

        return res;
    }
}