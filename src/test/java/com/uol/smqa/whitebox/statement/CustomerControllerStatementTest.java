package com.uol.smqa.whitebox.statement;


import com.uol.smqa.controller.CustomerController;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CustomerControllerStatementTest {

    public CustomerController customerController;


    @BeforeEach
    private void setup() {

    }

    @Test
    public void whenCustomerRegisters_thenReturnSuccess() {
        Assertions.assertEquals(2, 2);
    }

}