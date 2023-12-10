import java.util.Stack;
class Mysolution{

    public boolean isCheck(String s){
         Stack<Character> st = new Stack<>();
         
         for(int idx = 0; idx<s.length(); idx++){

            if(!st.isEmpty() && s.charAt(idx) == ')' && st.peek() == '(')
              st.pop();
            
            else if(!st.isEmpty() && s.charAt(idx) == '}' && st.peek() == '{')
              st.pop();

            else if(!st.isEmpty() && s.charAt(idx) == ']' && st.peek() == '[')
              st.pop();
            
            else
              st.push(s.charAt(idx));
         }
         
         return st.isEmpty() ? true : false;
         
    
    

    }//isCheck end
    public static void main(String[] args){
        
         System.out.println(new Mysolution().isCheck("()[]{}"));
    }//main end
}