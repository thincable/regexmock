package com.regexmock;

import com.regexmock.core.Pattern;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class Mock {

    public static String generate(String expression) {
        Pattern pattern = new Pattern(expression);
        return expression;
    }

}
