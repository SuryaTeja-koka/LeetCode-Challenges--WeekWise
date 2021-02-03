class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int n = A.length;
        int[] charFreq = new int[26];
        
		for(char c : A[0].toCharArray())
            charFreq[c - 'a']++;
        
        for(int i = 1; i < n; i++) {
            int[] currCharFreq = new int[26];
            for(Character c : A[i].toCharArray()) currCharFreq[c - 'a']++;
            for(int k = 0; k < 26; k++) charFreq[k] = Math.min(currCharFreq[k], charFreq[k]); 
        }
        
		for(int i = 0; i < 26; i++)
            while(charFreq[i]-- > 0)
                list.add(Character.toString(i + 'a')); //add only those that have frequency count > 0. If none, then return empty list.
        
        return list;
    }
}
