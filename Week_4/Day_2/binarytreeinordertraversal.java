class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        help(root , list);
        return list;
    }
    public void help(TreeNode t , List<Integer> list){
        if(t == null) return;
        if(t.left != null){
            help(t.left , list);
        }
        list.add(t.val);
        if(t.right != null){
            help(t.right , list);
        }
    }
}