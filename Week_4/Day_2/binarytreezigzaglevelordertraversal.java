class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean ltr = true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < n ; i++){
                TreeNode t = q.poll();
                if(ltr){
                    list.add(t.val);
                } else {
                    list.add(0 , t.val);
                }
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
            ans.add(list);
            ltr = !ltr;
        }
        return ans;
    }
}