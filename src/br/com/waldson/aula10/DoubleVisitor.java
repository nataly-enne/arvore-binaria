package br.com.waldson.aula10;

public class DoubleVisitor implements NodeVisitor {
    @Override
    public void visit(Node node) {
        node.setValue(node.getValue() * 2);
    }
}
