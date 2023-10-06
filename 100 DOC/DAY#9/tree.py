# Author: Vaikan Peddi
# Date: 6th October 2023
# Description: In this code, we will look into  basic model of trees using classes of Nodes to construct a tree

class TreeNode:
    def __init__(self, value:int) -> None:
        self.value:int = value
        self.right:TreeNode = None
        self.left:TreeNode = None

class Tree:
    def __init__(self):
        self.root = None

    def inorder_display(self, sub_tree_node):
        if sub_tree_node == None:
            return
        else:
            self.inorder_display(sub_tree_node.left)
            print(sub_tree_node.value)
            self.inorder_display(sub_tree_node.right)

    def preorder_display(self, sub_tree_node):
        if sub_tree_node == None:
            return
        else:
            print(sub_tree_node.value)
            self.inorder_display(sub_tree_node.left)
            self.inorder_display(sub_tree_node.right)

    def postorder_display(self, sub_tree_node):
        if sub_tree_node == None:
            return
        else:
            self.inorder_display(sub_tree_node.left)
            self.inorder_display(sub_tree_node.right)
            print(sub_tree_node.value)


tree = Tree()
tree.root = TreeNode(1)
tree.root.left = TreeNode(2)
tree.root.right = TreeNode(3)

tree.inorder_display(tree.root)
tree.postorder_display(tree.root)
tree.preorder_display(tree.root)

