//Given a binary tree, this method will return max height of the tree back. This can be useful to calculate runtime.
//minimise height to increase efficiency. 
//Method to make a balanced binary tree via rotation can be implemented in separate place
public static int getHeight(Node root){
       if(root == null) {
           return -1;
       }
       
       int left = 1 + getHeight(root.left);
       int right = 1 + getHeight(root.right);
        
       return Math.max(left, right);
    }
