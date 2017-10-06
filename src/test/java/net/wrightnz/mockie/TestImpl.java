/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.wrightnz.mockie;

/**
 *
 * @author richard wright
 */
public class TestImpl<T> implements TestInterface<T> {

    @Override
    public String doSoShit(String arg, Class<T> clazz) {
        return clazz.getSimpleName() + " " + arg;
    }

}
