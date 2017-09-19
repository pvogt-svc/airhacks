/*
 */
package com.airhacks.faema.coffee.boundary;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author airhacks.com
 */
public class ComplexLogicTest {

    private ComplexLogic cut;

    @Before
    public void setup() {
        this.cut = new ComplexLogic();
    }

    @Test
    public void calculate() {
        this.cut.calculate();
    }

}
