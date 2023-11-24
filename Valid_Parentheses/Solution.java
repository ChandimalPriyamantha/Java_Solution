class Solution {
    public boolean isValid(String s) {
   Stack<Character> st = new Stack<>();

   for (int x = 0; x<s.length(); x++){
       if(!st.isEmpty() && s.charAt(x) == ')' && st.peek() == '(')
         st.pop();
       else if(!st.isEmpty() && s.charAt(x) == '}' && st.peek() == '{')
         st.pop();
       else if(!st.isEmpty() && s.charAt(x) == ']' && st.peek() == '[')
         st.pop();
       else
         st.push(s.charAt(x));

   }

   return st.isEmpty() ? true: false;
    }
}