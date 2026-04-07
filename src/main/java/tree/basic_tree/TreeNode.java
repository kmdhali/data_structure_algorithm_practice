package tree.basic_tree;

import lombok.Data;

@Data
public class TreeNode <V>{
    V data;
    TreeNode<V> left;
    TreeNode<V> right;
}
