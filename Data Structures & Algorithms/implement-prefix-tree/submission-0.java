public class Tree{

    Tree[] child = new Tree[26];
    boolean flag=false;
}
class PrefixTree {
    public Tree root;
    public PrefixTree() {
        root=new Tree();
    }

    public void insert(String word) {
        Tree node=root;
        int n=word.length();
        for(int i=0;i<n;i++)
        {
            int index=word.charAt(i)-'a';
            if(node.child[index]==null)
            {
                node.child[index]=new Tree();
            }
            node=node.child[index];
        }
        node.flag=true;
    }

    public boolean search(String word) {
        int n=word.length();
        Tree node=root;
        for(int i=0;i<n;i++)
        {
            int index=word.charAt(i)-'a';
            if(node.child[index]==null)
            {
                return false;
            }
            node=node.child[index];
        }
        return node.flag;

    }

    public boolean startsWith(String prefix) {
        int n=prefix.length();
        Tree node=root;
        for(int i=0;i<n;i++)
        {
            int index=prefix.charAt(i)-'a';
            if(node.child[index]==null)
            {
                return false;
            }
            node=node.child[index];
        }
        return true;
    }
}
