class Solution {
    int idx = 0;
    Map<Integer , Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0 ; i < inorder.length ; i++){
            map.put(inorder[i] , i);
        }
        return help(preorder , 0 , inorder.length - 1);
    }
    public TreeNode help(int[] preorder , int l , int r){
        if(l > r){
            return null;
        }
        TreeNode t = new TreeNode(preorder[idx++]);
        int p = map.get(t.val);
        t.left = help(preorder , l , p - 1);
        t.right = help(preorder , p + 1 , r);
        return t;
    }
}