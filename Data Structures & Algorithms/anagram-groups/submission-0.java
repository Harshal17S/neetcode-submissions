class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();
        List<List<String>> ls = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];

            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String sorted = new String(chars);

            if (hm.containsKey(sorted)) {
                hm.get(sorted).add(strs[i]);
            } else {
                hm.put(sorted, new ArrayList<>());
                hm.get(sorted).add(strs[i]);
            }
        }

        ls.addAll(hm.values());

        return ls;
    }
}