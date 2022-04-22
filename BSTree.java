package com.assignments;
// Program constructing a Binary Search Tree

public class BSTree {
    public static void main(String[] args){
        Node node80 = new Node(80);
        Node node50 = new Node(50);
        Node node100 = new Node(100);
        Node node20 = new Node(20);
        Node node60 = new Node(60);
        Node node90 = new Node(90);
        Node node110 = new Node(110);

        node80.left = node50;
        node80.right = node100;
        node50.left = node20;
        node50.right = node60;
        node100.left = node90;
        node100.right = node110;

        printTree(node80,"");
        System.out.println();

        print(node80,"");
        // inserting new nodes into the BS Tree
        insertNode(150,node80);
        insertNode(105,node80);
        insertNode(55,node80);
        insertNode(81,node80);

        print(node80,"");

        //search for a node
        int x = search(node80,110000);
        if (x == -1)
            System.out.println("Can not find the node");
        else
            System.out.println("node is found");


    }
    static void printTree(Node node, String prefix)
    {
        if(node==null) return;
        System.out.println(prefix + " + " + node.data);
        printTree(node.left, prefix + " ");
        printTree(node.right, prefix + " ");
    }

    static void print(Node r,String indent){
        if(r != null){
            print(r.left, indent + "--");
            System.out.printf("%s %s%n",indent,r.data);
            print(r.right, indent + "--");
        }
    }

    static boolean insertNode(int x, Node root){
        Node current;
        Node parent;
        if(root == null){
            root = new Node(x);
            return true;
        }
        else{
            //Locate the parent node
            current = root;
            parent = current;
            while(current != null){
                if(x < current.data){
                    parent = current;
                    current = current.left;
                }
                else if (x > current.data){
                    parent = current;
                    current = current.right;
                }
                else
                    return false;
            }

            // create the new node and attach it to the parent node
            if (x < parent.data){
                parent.left = new Node(x);
                System.out.println("New Node is inserted");
            }
            else{
                parent.right = new Node(x);
                System.out.println("New Node is inserted");
            }
            return true;
        }
    }

    static int search(Node root, int key){
        if (root == null)
            return -1;
        if (key == root.data)
            return root.data;
        if (key < root.data)
            return search(root.left,key);
        if (key > root.data)
            return search(root.right,key);
        return -1;
    }
}
