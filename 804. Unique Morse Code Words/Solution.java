class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] table = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int count = 0;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            String encoded = "";
            for (int j = 0; j < words[i].length(); j++) {
                int idx = (int)words[i].charAt(j) - 97;
                encoded += table[idx];
            }
            set.add(encoded);
        }
        return set.size();
    }
}
