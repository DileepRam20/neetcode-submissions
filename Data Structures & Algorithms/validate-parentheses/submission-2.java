class Solution {
    public boolean isValid(String s) {
        int len=s.length();
        if(len%2!=0)
        {
            return false;
        }
        Stack<Character> st=new Stack<>();
        for(int i=0;i<len;i++)
        {
            char c=s.charAt(i);
            if(c == '('|| c == '{' || c == '[')
            {
                st.push(c);
            }
            else if( c == ']' && !st.isEmpty())
            {
                if(st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if( c == '}' && !st.isEmpty())
            {
                if(st.peek() == '{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if( c == ')' && !st.isEmpty())
            {
                if(st.peek() == '(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else 
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}
