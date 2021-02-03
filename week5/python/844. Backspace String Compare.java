class Solution {
    public boolean backspaceCompare(String S, String T) {
        return delete(S).equals(delete(T));
    }
    
    private String delete(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0 ; i < s.length(); i++) {
            if (ch[i]!='#') {
                st.push(ch[i]);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        
        return String.valueOf(st);
    }
}
