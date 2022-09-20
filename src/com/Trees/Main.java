package com.Trees;

class Tree {

    private TreeNode root;

    class TreeNode {
        TreeNode left, right;
        public int data;

        TreeNode() {
            this.left = null;
            this.right = null;
        }

        TreeNode(int d) {
            this.data = d;
        }
    }

    Tree(){
        this.root = null;
    }

    Tree(int d){
        root = new TreeNode(d);
    }


    public static void Inorder(){

    }

    public void Insert(int val){

    }


}

public class Main {

    public static void main(String[] args) {

    Tree tree = new Tree(67);



    }

}
