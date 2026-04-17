class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                stack.push(ch);
            }
            else
            {
                if(stack.isEmpty() || ch==')' && stack.peek()!= '(' || ch=='}' && stack.peek()!= '{' ||ch==']' && stack.peek()!= '[' )
                {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

        // Stack<Character> stack = new Stack<>();
        //     for(int i=0; i<s.length(); i++)
        //     {
        //         char c = s.charAt(i);

        //         if(c== '(' || c=='{' || c=='[')
        //         {
        //             stack.push(c);
        //         }
        //         else
        //         {
        //             if(stack.isEmpty()) return false;
        //             char top= stack.pop();
        //             if(c==')' && top != '(') return false;
        //             if(c=='}' && top != '{') return false;
        //             if(c==']' && top != '[') return false;

        //         }
        // }
        // return stack.isEmpty();
    }
}