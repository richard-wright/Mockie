/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wrightnz.mockie;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

/**
 *
 * @author Richard Wright
 */
public class AnyClassTest {

    private TestInterface<Boolean> inf;
    private TestInterface<String> impl;

    @Before
    public void before() {
        inf = mock(TestInterface.class);
        impl = new TestImpl();
    }

    @Test
    public void testGiven() {
        given(inf.doSoShit(anyString(), AnyClass.anyClass())).willReturn("foo");
        String result = inf.doSoShit("blah", Boolean.class);
        assertEquals("foo", result);
    }

    @Test
    public void testImpl() {
        String result = impl.doSoShit("blah", String.class);
        assertEquals("String blah", result);
    }

}
