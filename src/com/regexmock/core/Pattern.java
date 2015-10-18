package com.regexmock.core;

import com.regexmock.nodes.*;
import com.regexmock.nodes.Character;

import java.util.List;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class Pattern {
    private List<AbstractNode> nodes;

    public Pattern(String pattern) {
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            switch (c) {
                case 'd' :
                    nodes.add(new Digit());
                    break;
                default:
                    nodes.add(new Character(c));
                    break;
            }
        }
    }

    public String generate() {
        String result = "";
        for(AbstractNode node : nodes) {
            result += node.generate();
        }
        return result;
    }


}
