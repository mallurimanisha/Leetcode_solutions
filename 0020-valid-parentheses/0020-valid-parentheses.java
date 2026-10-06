class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        st.clear();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' ||ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char c2=st.pop();
                if((ch==')' && c2=='(') || (ch==']' && c2=='[') || (ch=='}' && c2=='{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}