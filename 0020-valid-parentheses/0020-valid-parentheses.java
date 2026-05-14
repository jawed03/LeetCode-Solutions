class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character> ();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[')
            stack.push(ch);
            else {
                // Prevent empty exception through not checking empty stack.
                if(stack.isEmpty())
                return false;

                else if(ch == ')' && stack.peek() == '(')
                stack.pop();
                else if(ch == '}' && stack.peek() == '{')
                stack.pop();
                else if(ch == ']' && stack.peek() == '[')
                stack.pop();
                else
                return false;
            }
        }
        return stack.isEmpty();
    }
}