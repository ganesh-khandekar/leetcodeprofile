class Solution {
    public boolean isValid(String s) {
         if (s.length() % 2 == 1)
            return false;
         Stack<Character> Parentheses =new Stack<>();
            
        for(char ch :s.toCharArray()){
            if(ch=='['||ch=='('||ch=='{'){
                Parentheses.push(ch);
            }else if(!Parentheses.isEmpty()&&ch==']'&&Parentheses.peek()=='['){
                Parentheses.pop();
            }else if(!Parentheses.isEmpty()&&ch=='}'&&Parentheses.peek()=='{'){
                Parentheses.pop();
            }else if(!Parentheses.isEmpty()&&ch==')'&&Parentheses.peek()=='('){
                Parentheses.pop();
            }else{
                return false;
            }
        }
            
        return Parentheses.isEmpty();
    }
}