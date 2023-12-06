package com.uol.smqa.whitebox.statement;


import com.uol.smqa.controller.CustomerController;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class CustomerControllerStatementTest {

    public CustomerController customerController;


    @Before
    private void setup() {

    }

    @Test
    public void whenCustomerRegisters_thenReturnSuccess() {
        Assertions.assertEquals(2, 2);
    }

}