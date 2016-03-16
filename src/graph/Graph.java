/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Thibaud
 */
public class Graph implements IDirectedGraph {

    List<Node> nodes;
    List<Arc> arcs;

    public Graph() {
    nodes= new ArrayList<>();
    arcs = new ArrayList<>();
}
    @Override
    public boolean hasArc(Node _n1, Node _n2) {
        boolean test = false;
        for (Arc arc : arcs) {
            if ((arc.getSource() == _n1) && (arc.getSource() == _n2)) {
                test=true;
            }
        }
        return test;
    }

    @Override
    public void addArc(Arc _edge) {
        arcs.add(_edge);
    }

    @Override
    public List<Arc> getArc(Node _n) {
        List<Arc> list = new ArrayList<>();
        arcs.stream().filter((arc) -> (arc.getSource() == _n)).forEach((arc) -> {
            list.add(arc);
        });  
        return list;
    }

    @Override
    public void addNode(Node _node) {
        nodes.add(_node);
    }

    @Override
    public List<Node> getAllNodes() {
        return nodes;
    }

    @Override
    public int getNbNodes() {
        return nodes.size();
    }

    @Override
    public List<Node> getAdjNodes(Node _n) {
        List<Node> list = new ArrayList<>();
        arcs.stream().filter((arc) -> (arc.getSource() == _n)).forEach((arc) -> {
            list.add(arc.getDestination());
        });  
        return list;
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
