package com.regexmock.nodes;

import java.util.List;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public abstract class AbstractNode {

    private List<AbstractNode> childNodes;

    public abstract String generate();

    public void addNode(AbstractNode node) {
        childNodes.add(node);
    }

    @Override
    public String toString() {
        String result = "";

        for(AbstractNode node : childNodes) {
            result += node.toString() + "\n";
        }

        return result;
    }
}
