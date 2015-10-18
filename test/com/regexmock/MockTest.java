package com.regexmock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Victor Fedorov on 18.10.15.
 */
public class MockTest {

    @Test
    public void testGenerate() {
        String pattern = "[4d*4d]";
        Assert.assertEquals(pattern, Mock.generate(pattern));
    }

}
