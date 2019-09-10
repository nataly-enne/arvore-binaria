package br.com.waldson.aula10;

public class Node {
    private int value;

    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void accessPreOrder(NodeVisitor v) {
        v.visit(this);

        if (this.left != null) {

            this.left.accessPreOrder(v);
        }

        if (this.right != null) {
            this.right.accessPreOrder(v);
        }
    }

    public void accessInOrder(NodeVisitor v) {
        if (this.left != null) {
            this.left.accessInOrder(v);
        }

        v.visit(this);

        if (this.right != null) {
            this.right.accessInOrder(v);
        }
    }

    public void accessPostOrder(NodeVisitor v) {
        if (this.left != null) {
            this.left.accessPostOrder(v);
        }

        if (this.right != null) {
            this.right.accessPostOrder(v);
        }

        v.visit(this);
    }

    public int getValue() {
        return value;
    }

    public Node removeMinorValue(Node node ){
        if (node == null) System.out.println("ERROR");

        else if (node.left != null){
            node.left = removeMinorValue(node.left);
            return node;
        }
        else{
            // when haven't left element, last way is right element.
            return node.right;
        }

        return null;
    }
}

