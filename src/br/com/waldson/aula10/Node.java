package br.com.waldson.aula10;

import java.util.*;

public class Node {
    private int value;

    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } 
            else {
                this.left.insert(node);
            }
        } 
        else if (node.value > this.value) {
            if  (this.right == null) {
                 this.right = node;
            } 
            else {
                this.right.insert(node);
            }
        }
    }

     public Node search (int key) {
        if (key == this.value) {
            return this;
        }
        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }
        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }
        return null;
    }

     public Node removeNode(Node node, int key){
        if (node == null){
            return node;
        }
        if(key > node.getValue()){
            node.right = removeNode(node.right, key);
        }
        else if (key < node.getValue()){
            node.left = removeNode(node.left, key);
        }
        else {
            if(key == node.getValue()){
                if(node.getLeft() == null && node.getRight() == null){
                    return null;
                }
                else if(node.getLeft() == null){
                    return node.getRight();
                }
                else if(node.right == null){
                    return node.getLeft();
                }
                else{
                    Integer minor = removeMinorValue(node.right);
                    node.value = minor;
                    node.right = removeNode(node.right, node.getValue());
                }
            }
        }
        return node;
    }

    private int removeMinorValue(Node node) {
        if(node.left != null){
            return removeMinorValue(node.left);
        }
        return node.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if(this == o){
            return true;
        }
        if(o == null || o.getClass() != this.getClass()){
            return false;
        }

        Node node = (Node) o;
        return Objects.equals(o, this);
    }
}

