import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        if(root==null)
            return list;
Queue<TreeNode> pending_child=new LinkedList<TreeNode>();
        pending_child.add(root);
        List<Integer> first_element =new ArrayList<Integer>();
        first_element.add(root.val);
        list.add(first_element);
        
        while(!pending_child.isEmpty())
        {
           int n=pending_child.size();
           List<Integer> children =new ArrayList<Integer>();
            for(int i=n;i>0;i--)
            {
                TreeNode front=pending_child.poll();
                //List<Integer> children =new ArrayList<Integer>();
                if(front.left!=null)
                {
                    children.add(front.left.val);
                    pending_child.add(front.left);
                }
                if(front.right!=null)
                {
                    children.add(front.right.val);
                    pending_child.add(front.right);
                }
            }
           if(!children.isEmpty())
           {
               list.add(children);
           }
        }
        return list;
        
        
    }
}
