package com.regexmock.nodes;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class Range extends AbstractNode {

    private String begin;
    private String end;

    public Range(String begin, String end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String generate() {
        return null;
    }
}
