class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);// to extract the ith character of string so that we can use it later to compare
            if (ch=='('||ch=='{'||ch=='[') st.push(ch);
            else{//ch closing bracket hua tb 
               if(st.size()==0) return false;
               char top = st.peek();
               if(sameStyle(top,ch)) st.pop();
               else return false;
            }
        }
        if(st.size()==0) return true;
        else return false;
    }
    static boolean sameStyle(char a,char b){
        if(a=='(' && b==')'||a=='{' && b=='}'||a=='[' && b==']') return true;
        return false;
    }
}