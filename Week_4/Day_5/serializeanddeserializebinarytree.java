public class Codec {
    public String serialize(TreeNode root) {
        if(root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t == null){
                sb.append("null,");
                continue;
            }
            sb.append(t.val).append(",");
            q.offer(t.left);
            q.offer(t.right);
        }
        return sb.toString();
    }
    public TreeNode deserialize(String data) {
        if(data.length() == 0){
            return null;
        }
        String arr[] = data.split(",");
        TreeNode t = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(t);
        int i = 1;
        while(!q.isEmpty()){
            TreeNode n = q.poll();
            if(!arr[i].equals("null")){
                n.left = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(n.left);
            }
            i++;
            if(!arr[i].equals("null")){
                n.right = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(n.right);
            }
            i++;
        }
        return t;
    }
}