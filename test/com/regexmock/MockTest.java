package com.regexmock;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class MockTest {

    @Test
    public void testGenerate() {
        String expression = "asw";
        String generated = Mock.generate(expression);
        System.out.println(generated);
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(generated);
//        System.out.println(matcher.matches());
        Assert.assertTrue(matcher.matches());
    }

}
