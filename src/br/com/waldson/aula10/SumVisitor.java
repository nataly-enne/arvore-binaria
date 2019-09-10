package br.com.waldson.aula10;

public class SumVisitor  implements NodeVisitor {
    private int sum = 0;

    @Override
    public void visit(Node node) {
        sum += node.getValue();
    }

    public int getSum() {
        return sum;
    }
}
