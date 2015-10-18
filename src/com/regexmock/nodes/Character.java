package com.regexmock.nodes;

/**
 * Created by Victor Fedorov on 19.10.15.
 */
public class Character extends AbstractNode {

    char character;

    public Character(char character) {
        this.character = character;
    }

    @Override
    public String generate() {
        return null;
    }

    @Override
    public String toString() {
        return "<character>" + character + "</character>";
    }
}
