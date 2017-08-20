package com.hq.easy.exersice8_6;

/**
 * Created by hq on 17/8/6.
 *
 * 合并二叉树
 */
public class CombineTwoBinaryTree {
    public static void main(String[] args) {

    }

    
    public TreeNode merageTreeVal(TreeNode sourceTree, TreeNode targateTree) {
        if (sourceTree != null) {
            if (targateTree != null) {
                sourceTree.val += targateTree.val;
            }
        } else {
            if (targateTree != null) {
                sourceTree.val = targateTree.val;
            }
        }
        return sourceTree;
    }
}

 class TreeNode{
     int val;
     TreeNode leftNode;
     TreeNode rightNode;
     public TreeNode(int val) {
         this.val = val;
     }
 }
