class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> occurenceS = new HashMap<>();

        for(int i = 0;i < s.length(); i++){
            occurenceS.merge(s.charAt(i), 1, Integer::sum);
        }

        for(int i = 0;i < t.length(); i++){
            occurenceS.merge(t.charAt(i), -1, Integer::sum);
        }

       for (int value : occurenceS.values()) {
        if (value != 0) return false;
    }

    return true;
    }
}
