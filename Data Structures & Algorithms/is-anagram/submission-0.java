class Solution {
    public boolean isAnagram(String s, String t) {
            // HashMap<Charcter,Integer> hm=new HashMap<>();

            // for(int i=0;i<s.length;i++){
            //     if(hm.containsKey(s(i))){
            //         hm.put(s(i),hm.getorDefault(s(i))+1)
            //     }
            //     else{
            //         hm.put(s(i),hm.getorDefault(s(i)));
            //     }
            // }

            // for(int i=0;i<)


            char[] chars = s.toCharArray();
        Arrays.sort(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);

        if (chars.length != chars2.length) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] != chars2[i]) {
                return false;
            }
        }

        return true;
}}
