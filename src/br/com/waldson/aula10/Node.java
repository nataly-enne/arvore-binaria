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

