class validateBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }
    
    boolean isValidBSTHelper(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;
        
        return isValidBSTHelper(root.left, min, root) && isValidBSTHelper(root.right, root, max);
    }
}