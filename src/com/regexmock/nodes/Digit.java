package com.regexmock.nodes;

import java.util.Random;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class Digit extends AbstractNode {
    @Override
    public String generate() {
        Random random = new Random();
        return Integer.toString(random.nextInt(9));
    }

    @Override
    public String toString() {
        return "<digit/>";
    }
}
