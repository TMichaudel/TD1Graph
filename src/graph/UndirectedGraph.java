/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Thibaud
 */
public class UndirectedGraph implements IUndirectedGraph {
    Graph undirGraph;
    
    public UndirectedGraph(){
        undirGraph = new Graph();
    }
    
    @Override
    public void addEdge(Node _node1, Node _node2) {
       undirGraph.addArc(new Arc(_node1, _node2, null));
       undirGraph.addArc(new Arc(_node2, _node1, null));
    }

    @Override
    public boolean hasEdge(Node _node1, Node _node2) {
        return undirGraph.hasArc(_node1, _node2);
    }

    @Override
    public void addNode(Node _node) {
        undirGraph.addNode(_node);
    }

    @Override
    public List<Node> getAllNodes() {
        return undirGraph.getAllNodes();
    }

    @Override
    public int getNbNodes() {
        return undirGraph.getNbNodes();
    }

    @Override
    public List<Node> getAdjNodes(Node _n) {
        return undirGraph.getAdjNodes(_n);
    }

    @Override
    public Iterator<Node> creerBFSIterator(Node n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Node> creerDFSIterator(Node n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
