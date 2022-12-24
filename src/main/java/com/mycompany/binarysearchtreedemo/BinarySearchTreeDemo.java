package com.mycompany.binarysearchtreedemo;

import java.util.Scanner;

public class BinarySearchTreeDemo {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      BinarySearchTree tree = new BinarySearchTree();
      
      // Ask user for values to insert
      System.out.print("Enter values to insert with spaces between: ");
      String userValues = scnr.nextLine();
      System.out.println();
      
      // Add each value to the tree
      for (String value : userValues.split(" ")) {
         int key = Integer.parseInt(value);
         tree.insert(new Node(key));
      }
      
      // Show the tree
      System.out.println("Initial tree:");
      System.out.println(BSTPrint.treeToString(tree.getRoot()));
      System.out.println();
      
      
      
   }
}


