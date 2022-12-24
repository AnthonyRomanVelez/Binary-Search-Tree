package com.mycompany.binarysearchtreedemo;

class BinarySearchTree {
   private Node root;
   
   public BinarySearchTree() {
      root = null;
   }
   
   public Node getRoot() {
      return root;
   }
   
   public Node search(int desiredKey) {
      Node currentNode = root;
      while (currentNode != null) {
         // Return the node if the key matches
         if (currentNode.key == desiredKey) {
            return currentNode;
         }
         
         // Navigate to the left if the search key is 
         // less than the node's key.
         else if (desiredKey < currentNode.key) {
            currentNode = currentNode.left;
         }
         
         // Navigate to the right if the search key is 
         // greater than the node's key.
         else {
            currentNode = currentNode.right;
         }
      }
      
      // The key was not found in the tree.
      return null;
   }
   
   public void insert(Node node) {
      // Check if tree is empty
      if (root == null) {
         root = node;
      }
      else {
         Node currentNode = root;
         while (currentNode != null) {
            if (node.key < currentNode.key) {
               // If no left child exists, add the new node
               // here; otherwise repeat from the left child.
               if (currentNode.left == null) {
                  currentNode.left = node;
                  currentNode = null;
               }
               else {
                  currentNode = currentNode.left;
               }
            }
            else {
               // If no right child exists, add the new node
               // here; otherwise repeat from the right child.
               if (currentNode.right == null) {
                  currentNode.right = node;
                  currentNode = null;
               }
               else {
                  currentNode = currentNode.right;
               }
            }
         }
      }
   }
   /*int nodeLevel(Node node, int key, int level){
       if (node == null)
           return 0;
       
       else if (node.key == level)
           return level;
       
       int levels = nodeLevel(node.left,key,level + 1);
       if (levels != 0)
           return levels;
         levels = nodeLevel(node.right,key,level + 1);
       if (levels != 0)
           return levels;
   }*/
   
   }
   
   

