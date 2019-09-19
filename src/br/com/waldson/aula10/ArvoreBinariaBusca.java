package br.com.waldson.aula10;

public class ArvoreBinariaBusca {
    private Node root = null;

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot(){
        return this.root;
    }

    public void insert(Node node) {
        if (root == null) {
            root = node;
            return;
        }
        root.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (root == null) {
            return root;
        }
        return root.search(key);
    }

    public void remove(int key){
        root.removeNode(this.root , key);
    }


}