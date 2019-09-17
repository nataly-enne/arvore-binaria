package br.com.waldson.aula10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Test {
    private ArvoreBinariaBusca tree;
    
    @Before
    public void setUp() throws Exception {
        tree = new ArvoreBinariaBusca();
    }

    @Test
    public void isEmpty() {
        tree.insert(10);
        assertEquals(false,tree.isEmpty());
    }

    @Test
    public void getRoot() {
        Node root = new Node(10);
        tree.insert(root);
        assertEquals(root,tree.getRoot());
    }

    @Test
    public void insert() {
        tree.insert(20);
        assertEquals(false,tree.isEmpty());
    }

    @Test
    public void search() {
        Node node = new Node(5);
        tree.insert(10);
        tree.insert(20);
        tree.insert(node);
        assertEquals(node, tree.search(5));
    }

    @Test
    public void removeIfNodeIsLeaf() {
        tree.insert(10);
        tree.insert(20);
        tree.insert(5);
        tree.remove(5);
        assertEquals(null, tree.search(5));

    }

    @Test
    public void removeIfNodeHasOneChild() {
        tree.insert(6);
        tree.insert(4);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.remove(2);
        assertEquals(1,tree.search(4).getLeft().getValue());
    }

    @Test
    public void removeIfNodeHasTwoChildren() {
        tree.insert(6);
        tree.insert(4);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.remove(4);
        assertEquals(5,tree.search(6).getLeft().getValue());
    }
}