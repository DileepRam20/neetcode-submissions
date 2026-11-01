class Tree{
    Tree[] child=new Tree[26];
    boolean flag=false;
}

class WordDictionary {
    public Tree root;
    public int index;
    public WordDictionary() {
        root=new Tree();
    }

    public void addWord(String word) {
        int n=word.length();
        Tree node=root;
        for(int i=0;i<n;i++)
        {
            index=word.charAt(i)-'a';
            
            if(node.child[index]==null)
            {
                node.child[index]=new Tree();
            }
            node=node.child[index];
        }
        node.flag=true;
    }

    public boolean search(String word) {
        return dfs(0,root,word);
    }
    public boolean dfs(int j,Tree root,String word)
    {
        Tree curr=root;
        for(int i=j;i<word.length();i++)
        {
            char c= word.charAt(i);
            if(c == '.')
            {
                for( Tree next : curr.child)
                {
                    if(next!=null && dfs(i+1,next,word))
                    {
                        return true;
                    }
                }
                return false;
            }
            else
            {
                if(curr.child[c-'a'] == null)
                {
                    return false;
                }
                curr=curr.child[c-'a'];
            }
        }
        return curr.flag;
    }
}
