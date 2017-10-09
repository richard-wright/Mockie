/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wrightnz.mockie;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

/**
 *
 * @author Richard Wright
 */
@RunWith(MockitoJUnitRunner.class)
public class AnyClassTest {

    @Mock
    private TestInterface<Boolean> inf;

    private TestInterface<String> impl;

    @Before
    public void before() {
        impl = new TestImpl<>();
    }

    @Test
    public void testGiven() {
        given(inf.doSomeStuff(anyString(), AnyClass.anyClass())).willReturn("foo");
        String result = inf.doSomeStuff("blah", Boolean.class);
        assertEquals("foo", result);
    }

    @Test
    public void testImpl() {
        String result = impl.doSomeStuff("blah", String.class);
        assertEquals("String blah", result);
    }

}
