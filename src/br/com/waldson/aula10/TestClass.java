package br.com.waldson.aula10;

import org.junit.*;
import static org.junit.Assert.*;

public class TestClass {
    private ArvoreBinariaBusca tree;
    
    @Before
    public void setUp() throws Exception {
        tree = new ArvoreBinariaBusca();
    }

    @Test
    public void isEmpty() {
        tree.insert(11);

        assertFalse(tree.isEmpty());
    }

    @Test
    public void getRoot() { // teste de pegar a raiz
        Node root = new Node(10);
        tree.insert(root);
        
        assertEquals(
            root,
            tree.getRoot()
        );
    }

    @Test
    public void insert() { // testando a função de inserir
        tree.insert(30);

        assertFalse(tree.isEmpty());
    }

    @Test
    public void search() {  // teste de pesquisar o nó
        Node node = new Node(5);
        tree.insert(13);
        tree.insert(30);
        tree.insert(node);
        
        assertEquals(
            node, 
            tree.search(5)
        );
    }

    @Test
    public void removeIfNodeHasOneChild() { // remove se houver um filho
        tree.insert(87);
        tree.insert(34);
        tree.insert(1);
        tree.insert(3);

        tree.remove(1);

        assertEquals(3, tree.search(34).getLeft().getValue());
    }

    @Test
    public void removeIfNodeIsLeaf() { // remove se o nó for folha
        tree.insert(1);
        tree.insert(2);
        tree.insert(6);

        tree.remove(6);

        assertNull(tree.search(6));

    }

    @Test
    public void removeIfNodeHasTwoChildren() {
        tree.insert(7);
        tree.insert(4);
        tree.insert(5);
        tree.insert(9);

        tree.remove(4);

        assertEquals(5,tree.search(7).getLeft().getValue());
    }
}