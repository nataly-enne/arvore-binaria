package br.com.waldson.aula10;

public class Main {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.setLeft(new Node(5));
        root.setRight(new Node(30));
        root.setValue(20);

        root.removeMinorValue(root);
        System.out.println("Removed " + root.getValue());
    }
}
