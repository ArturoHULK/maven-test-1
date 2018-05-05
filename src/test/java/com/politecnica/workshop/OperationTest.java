package com.politecnica.workshop;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {
    @Test
    public void sumGreatherThan10MustReturnSuccesfully(){
        //Given:
        Operation operation = new Operation();

        //When:
        int result = operation.suma(10,20);

        //Then:
        assertEquals("La suma debe ser 30", 30,result);
    }

    @Test(expected = RuntimeException.class)
    public void sumLessThan10MustThrowException() {
        //Given:
        Operation operation = new Operation();

        //When:
        int result = operation.suma(1,3);
    }
}
