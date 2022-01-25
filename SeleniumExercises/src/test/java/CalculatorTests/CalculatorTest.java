package CalculatorTests;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    /*
    Testy klasy Calculator. Przypadki testowe do pokrycia:

    1. Dodawanie dwóch liczb całkowitych z wykorzystaniem metody assertTrue()
    2. Dodawanie dwóch liczb całkowitych z wykorzystaniem metody assertFalse()
    3. Dodawanie dwóch liczb całkowitych z wykorzystaniem metody assertEquals()
     */

    Calculator calculator = new Calculator();

    @Test
    public void addTestAssertTrue(){

        assertTrue(calculator.add(2, 3)==5);
    }

    @Test
    public void addTestAssertFalse(){

        assertFalse(calculator.add(1, 3)==5);
    }

    @Test
    public void addTestAssertEquals(){

        assertEquals(calculator.add(1, 3),4);
    }
}
