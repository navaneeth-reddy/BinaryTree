package com.example.navaneethreddy.binarytree1;

import android.view.ViewGroup;
import android.widget.Toast;

public class BinaryTree
{
    private Node root;
    private int count;
    String parent, result;

    public BinaryTree()
    {
        this.root = null;
        this.count = 0;
    }

    public int getCount() {

        return count;
    }

    public void add(int payload)
    {
        Node n = new Node(payload);
        this.count++;

        if(this.root == null)
        {
            this.root = n;
        }
        else
        {
            //we know that this.root is a thing
            this.root.add(n);
        }
    }

    public void inOrder(Node node)
    {
        if(node == null)
        {
            System.out.println("There are no numbers entered");
            return;
        }
        else
        {
            inOrder(node.getLeftChild());
            parent = parent + node.getPayload();
            inOrder(node.getRightChild());
        }
    }

    public void preOrder(Node node)
    {
        if(node == null)
        {
            System.out.println("There are no numbers entered");
            return;
        }
        else
        {
            parent = parent + node.getPayload();
            preOrder(node.getLeftChild());
            preOrder(node.getRightChild());
        }
    }
    public void postOrder(Node node)
    {
        if(node == null)
        {
            System.out.println("There are no numbers entered");
            return;
        }
        else
        {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            parent = parent + node.getPayload();
        }
    }




    public String inOrderMethodCall() {
        parent = "";
        result = "";
        inOrder(this.root);
        result = "InOrder " + parent;
        return result;
    }

    public String preOrderMethodCall() {
        parent = "";
        result = "";
        preOrder(this.root);
        result = "PreOrder " + parent;
        return result;
    }

    public String postOrderMethodCall() {
        parent = "";
        result = "";
        postOrder(this.root);
        result = "PostOrder " + parent;
        return result;
    }


}

